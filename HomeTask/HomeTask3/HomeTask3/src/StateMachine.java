import java.util.HashMap;
import java.util.Map;

public class StateMachine
{
    public enum e_stateMachine
    {
        IDLE,
        CAR_MAKE,
        CAR_ID,
        CAR_MODEL,
        CAR_YEAR,
        CAR_COLOR,
        CAR_PRICE,
        CAR_REGISNUM,
        CHECK_INPUT,
        STORE_IN_FILE,
        FILE_CREATION,
        EXIT
    }
    private e_stateMachine l_currentState = e_stateMachine.IDLE;
    private e_stateMachine l_nextState = e_stateMachine.CAR_ID;
    private Map<e_stateMachine, e_stateMachine[]> stateTransitions = new HashMap<>();

    /* Constructor */
    public StateMachine()
    {
        stateTransitions.put(e_stateMachine.IDLE, new e_stateMachine[]
                {
                    e_stateMachine.CAR_MAKE
                });
        stateTransitions.put(e_stateMachine.CAR_MAKE, new e_stateMachine[]
                {
                        e_stateMachine.CAR_ID
                });
        /* */
        stateTransitions.put(e_stateMachine.CAR_ID, new e_stateMachine[]
                {
                    e_stateMachine.CAR_MODEL
                });

        /* State after Name */
        stateTransitions.put(e_stateMachine.CAR_MODEL, new e_stateMachine[]
                {
                        e_stateMachine.CAR_YEAR
                });

        /* State after Surname */
        stateTransitions.put(e_stateMachine.CAR_YEAR, new e_stateMachine[]
                {
                        e_stateMachine.CAR_COLOR
                });

        /* State after Age */
        stateTransitions.put(e_stateMachine.CAR_COLOR, new e_stateMachine[]
                {
                        e_stateMachine.CAR_PRICE
                });

        /* State after Sport */
        stateTransitions.put(e_stateMachine.CAR_PRICE, new e_stateMachine[]
                {
                        e_stateMachine.CAR_REGISNUM
                });

        /* State after Awards */
        stateTransitions.put(e_stateMachine.CAR_REGISNUM, new e_stateMachine[]
                {
                        e_stateMachine.CHECK_INPUT
                });
        /* State after Awards */
        stateTransitions.put(e_stateMachine.CHECK_INPUT, new e_stateMachine[]
                {
                        e_stateMachine.IDLE,
                        e_stateMachine.STORE_IN_FILE
                });
        /* State after Awards */
        stateTransitions.put(e_stateMachine.STORE_IN_FILE, new e_stateMachine[]
                {
                        e_stateMachine.FILE_CREATION
                });
        /* State after Awards */
        stateTransitions.put(e_stateMachine.FILE_CREATION, new e_stateMachine[]
                {
                        e_stateMachine.STORE_IN_FILE,
                        e_stateMachine.FILE_CREATION,
                        e_stateMachine.EXIT
                });
        /* State after Exit */
        stateTransitions.put(e_stateMachine.EXIT, new e_stateMachine[]
                {
                        e_stateMachine.EXIT
                });
    }

    public e_stateMachine getCurrentState()
    {
        return l_currentState;
    }

    public void stm_NextState(e_stateMachine nextState)
    {
        e_stateMachine[] validStateTransitions = stateTransitions.get(l_currentState);
        if(validStateTransitions != null)
        {
            for(e_stateMachine validState : validStateTransitions)
            {
                if(validState == nextState)
                {
                    l_currentState = nextState;
                    return;
                }
            }
        }
        System.out.println("Transition to new state invalid");
    }
}
