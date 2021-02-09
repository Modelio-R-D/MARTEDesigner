package org.modelio.module.marte.profile.utils;


public class MARTEEnumerationUtils {
    private static String[] _transmModeKind = {
        "simplex", 
        "half-duplex", 
        "full-duplex"};

    private static String[] _eventKind = {
        "start", 
        "finish", 
        "send",
        "receive",
        "consume"};

    private static String[] _timeInterpretationKind = {
        "duration", 
        "instant"};

    private static String[] _allocationNature = {
        "spatialDistribution", 
        "timeScheduling"};

    private static String[] _laxityKind = {
        "hard", 
        "soft",
        "other"};

    private static String[] _allocationKind = {
        "structural", 
        "behavioral", 
        "hybrid"};

    private static String[] _allocationEndKind = {
        "undef", 
        "application", 
        "executionPlatform", 
        "both"};

    private static String[] _schedPolicyKind = {
        "EarliestDeadlineFirst",
        "FIFO",
        "FixedPriority",
        "LeastLaxityFirst",
        "RoundRobin",
        "TimeTableDriven",
        "Undef",
        "Other"};

    private static String[] _protectProtocolKind = {
        "FIFO",
        "NoPreemption",
        "PriorityCeiling",
        "PriorityInheritance",
        "StackBased",
        "Undef",
        "Other"};

    private static String[] _poolMgtPolicyKind = {
        "inifiniteWait",
        "timedWait",
        "dynamic",
        "exception",
        "other"};

    private static String[] _callConcurrencyKind = {
        "sequential",
        "guarded",
        "concurrent"};

    private static String[] _synchronisationKind = {
        "synchronous",
        "asynchronous",
        "delayedSynchronous",
        "rendezVous",
        "other"};

    private static String[] _executionKind = {
        "deferred",
        "remoteImmediate",
        "localImmediate"};

    private static String[] _concurrencyKind = {
        "reader",
        "writer",
        "parallel"};

    private static String[] _iSA_Type = {
        "RISC",
        "CISC",
        "VLIW",
        "SIMD",
        "other",
        "undef"};

    private static String[] _pLD_Technology = {
        "SRAM",
        "antifuse",
        "flash",
        "other",
        "undef"};

    private static String[] _pLD_Class = {
        "symetricalArray",
        "rowBased",
        "seaOfGates",
        "hierarchicalPLD",
        "other",
        "undef"};

    private static String[] _repl_Policy = {
        "LRU",
        "NFU",
        "FIFO",
        "random",
        "other",
        "undef"};

    private static String[] _writePolicy = {
        "writeBack",
        "writeThrough",
        "other",
        "undef"};

    private static String[] _cacheType = {
        "data",
        "instruction",
        "unified",
        "other",
        "undef"};

    private static String[] _rOM_Type = {
        "maskedROM",
        "EPROM",
        "OTP_EPROM",
        "EEPROM",
        "flash",
        "other",
        "undefined"};

    private static String[] _componentKind = {
        "card",
        "channel",
        "chip",
        "port",
        "unit",
        "other",
        "undef"};

    private static String[] _interruptKind = {
        "HardWareInterruption",
        "ProcessorDetectedException",
        "ProgrammedException",
        "Undef",
        "Other"};

    private static String[] _messageResourceKind = {
        "MessageQueue",
        "Pipe",
        "Blackboard",
        "Undef",
        "Other"};

    private static String[] _notificationKind = {
        "Memorized",
        "Bounded",
        "Memoryless",
        "Undef",
        "Other"};

    private static String[] _notificationResourceKind = {
        "Event",
        "Barrier",
        "Undef",
        "Other"};

    private static String[] _mutualExclusionResourceKind = {
        "BooleanSemaphore",
        "CountSemaphore",
        "Mutex",
        "Undef",
        "Other"};

    private static String[] _concurrentAccessProtocolKind = {
        "PIP",
        "PCP",
        "NoPreemption",
        "Undef",
        "Other"};

    private static String[] _queuePolicyKind = {
        "FIFO",
        "LIFO",
        "Priority",
        "Undef",
        "Other"};

    private static String[] _variableDirectionKind = {
        "in", 
        "out", 
        "inout"};

    private static String[] _mutualExclusionresKind = {
        "BooleanSemaphore", 
        "CountSemaphore", 
        "Mutex", 
        "Undef", 
        "Other"};

    private static String[] _dataPoolOrderingKind = {
        "FIFO", 
        "LIFO", 
        "UserDefined"};

    private static String[] _flowDirectionKind = {
        "in",
        "out",
        "inout"};

    private static String[] _clientServerKind = {
        "provided",
        "required",
        "proreq"};

    private static String[] _portSpecificationKind = {
        "atomic",
        "interfaceBased",
        "featureBased"};

    private static String[] _optimallityCriterionKind = {
        "meeetHardDeadlines",
        "minimizeMissedDeadlines",
        "minimizeMeanTardiness",
        "undef",
        "other"};

    private static String[] _timeNatureKind = {"discrete","dense"};

    public static boolean isTimeNatureKind(final String totest) {
        for (String  value : _timeNatureKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getTimeNatureKind() {
        return _timeNatureKind;
    }

    public static boolean isEventKind(final String totest) {
        for (String  value : _eventKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getEventKind() {
        return _eventKind;
    }

    public static boolean isOptimallityCriterionKind(final String totest) {
        for (String  value : _optimallityCriterionKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getOptimallityCriterionKind() {
        return _optimallityCriterionKind;
    }

    public static boolean isTimeInterpretationKind(final String totest) {
        for (String  value : _timeInterpretationKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getTimeInterpretationKind() {
        return _timeInterpretationKind;
    }

    public static boolean isAllocationKind(final String totest) {
        for (String  value : _allocationKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getAllocationKind() {
        return _allocationKind;
    }

    public static boolean isLaxityKind(final String totest) {
        for (String  value : _laxityKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getLaxityKind() {
        return _laxityKind;
    }

    public static boolean isAllocationEndKind(final String totest) {
        for (String  value : _allocationEndKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getAllocationEndKind() {
        return _allocationEndKind;
    }

    public static boolean isAllocationNature(final String totest) {
        for (String  value : _allocationNature){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getAllocationNature() {
        return _allocationNature;
    }

    public static boolean isSchedPolicyKind(final String totest) {
        for (String  value : _schedPolicyKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getSchedPolicyKind() {
        return _schedPolicyKind;
    }

    public static boolean isProtectProtocolKind(final String totest) {
        for (String  value : _protectProtocolKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getProtectProtocolKind() {
        return _protectProtocolKind;
    }

    public static boolean isPoolMgtPolicyKind(final String totest) {
        for (String  value : _poolMgtPolicyKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getPoolMgtPolicyKind() {
        return _poolMgtPolicyKind;
    }

    public static boolean isCallConcurrencyKind(final String totest) {
        for (String  value : _callConcurrencyKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getCallConcurrencyKind() {
        return _callConcurrencyKind;
    }

    public static boolean isSynchronisationKind(final String totest) {
        for (String  value : _synchronisationKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getSynchronisationKind() {
        return _synchronisationKind;
    }

    public static boolean isExecutionKind(final String totest) {
        for (String  value : _executionKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getExecutionKind() {
        return _executionKind;
    }

    public static boolean isConcurrencyKind(final String totest) {
        for (String  value : _concurrencyKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getConcurrencyKind() {
        return _concurrencyKind;
    }

    public static boolean isISA_Type(final String totest) {
        for (String  value : _iSA_Type){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getISA_Type() {
        return _iSA_Type;
    }

    public static boolean isPLD_Technology(final String totest) {
        for (String  value : _pLD_Technology){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getPLD_Class() {
        return _pLD_Class;
    }

    public static boolean isPLD_Class(final String totest) {
        for (String  value : _pLD_Class){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getPLD_Technology() {
        return _pLD_Technology;
    }

    public static boolean isRepl_Policy(final String totest) {
        for (String  value : _repl_Policy){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getRepl_Policy() {
        return _repl_Policy;
    }

    public static boolean isWritePolicy(final String totest) {
        for (String  value : _writePolicy){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getWritePolicy() {
        return _writePolicy;
    }

    public static boolean isCacheType(final String totest) {
        for (String  value : _cacheType){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getCacheType() {
        return _cacheType;
    }

    public static boolean isROM_Type(final String totest) {
        for (String  value : _rOM_Type){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getROM_Type() {
        return _rOM_Type;
    }

    public static boolean isComponentKind(final String totest) {
        for (String  value : _componentKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getComponentKind() {
        return _componentKind;
    }

    public static boolean isInterruptKind(final String totest) {
        for (String  value : _interruptKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getInterruptKind() {
        return _interruptKind;
    }

    public static boolean isMessageResourceKind(final String totest) {
        for (String  value : _messageResourceKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getMessageResourceKind() {
        return _messageResourceKind;
    }

    public static boolean isNotificationKind(final String totest) {
        for (String  value : _notificationKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getNotificationKind() {
        return _notificationKind;
    }

    public static boolean isNotificationResourceKind(final String totest) {
        for (String  value : _notificationResourceKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getNotificationResourceKind() {
        return _notificationResourceKind;
    }

    public static boolean isMutualExclusionResourceKind(final String totest) {
        for (String  value : _mutualExclusionResourceKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getMutualExclusionResourceKind() {
        return _mutualExclusionResourceKind;
    }

    public static boolean isConcurrentAccessProtocolKind(final String totest) {
        for (String  value : _concurrentAccessProtocolKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getConcurrentAccessProtocolKind() {
        return _concurrentAccessProtocolKind;
    }

    public static boolean isQueuePolicyKind(final String totest) {
        for (String  value : _queuePolicyKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getQueuePolicyKind() {
        return _queuePolicyKind;
    }

    public static boolean isTransModeKind(final String totest) {
        for (String  value : _transmModeKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getTransmModeKind() {
        return _transmModeKind;
    }

    public static boolean isVariableDirectionKind(final String totest) {
        for (String  value : _variableDirectionKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getVariableDirectionKind() {
        return _variableDirectionKind;
    }

    public static boolean isMutualExclusionresKind(final String totest) {
        for (String  value : _mutualExclusionresKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getMutualExclusionresKind() {
        return _mutualExclusionresKind;
    }

    public static boolean isDataPoolOderingKind(final String totest) {
        for (String  value : _dataPoolOrderingKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getDataPoolOderingKind() {
        return _dataPoolOrderingKind;
    }

    public static boolean isFlowDirectionKind(final String totest) {
        for (String  value : _flowDirectionKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getFlowDirectionKind() {
        return _flowDirectionKind;
    }

    public static boolean isPortSpecificationKind(final String totest) {
        for (String  value : _portSpecificationKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getPortSpecificationKind() {
        return _portSpecificationKind;
    }

    public static boolean isClientServerKind(final String totest) {
        for (String  value : _clientServerKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    public static String[] getClientServerKind() {
        return _clientServerKind;
    }

}
