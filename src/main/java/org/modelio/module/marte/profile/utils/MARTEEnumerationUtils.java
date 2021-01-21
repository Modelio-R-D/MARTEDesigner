package org.modelio.module.marte.profile.utils;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("056f8f43-9f92-417d-9271-fc5c5675d4f7")
public class MARTEEnumerationUtils {
    @objid ("c1c01dad-6865-4c1f-bc1c-972b8fbf1fbb")
    private static String[] _transmModeKind = {
        "simplex", 
        "half-duplex", 
        "full-duplex"};

    @objid ("9371e692-16af-45b1-a837-273f96af2844")
    private static String[] _eventKind = {
        "start", 
        "finish", 
        "send",
        "receive",
        "consume"};

    @objid ("1cecd544-fbbf-4ccd-9517-b7204f61a649")
    private static String[] _timeInterpretationKind = {
        "duration", 
        "instant"};

    @objid ("78ee7724-451b-43d5-b9fc-e8a68aa1b1f6")
    private static String[] _allocationNature = {
        "spatialDistribution", 
        "timeScheduling"};

    @objid ("d2e03f39-49a6-4471-8e19-9740c8390d83")
    private static String[] _laxityKind = {
        "hard", 
        "soft",
        "other"};

    @objid ("c5b06f39-877f-4c76-9d7c-ad9ad3b5cf8b")
    private static String[] _allocationKind = {
        "structural", 
        "behavioral", 
        "hybrid"};

    @objid ("0f1d1972-3b7f-42b3-b7a2-bdd2c1b51bc3")
    private static String[] _allocationEndKind = {
        "undef", 
        "application", 
        "executionPlatform", 
        "both"};

    @objid ("48983c36-ddc5-4163-aeb8-aa15edaebef0")
    private static String[] _schedPolicyKind = {
        "EarliestDeadlineFirst",
        "FIFO",
        "FixedPriority",
        "LeastLaxityFirst",
        "RoundRobin",
        "TimeTableDriven",
        "Undef",
        "Other"};

    @objid ("fcd7f805-d6ff-4008-93ca-72539bcc0f1b")
    private static String[] _protectProtocolKind = {
        "FIFO",
        "NoPreemption",
        "PriorityCeiling",
        "PriorityInheritance",
        "StackBased",
        "Undef",
        "Other"};

    @objid ("66d554fb-1a61-4cab-9a83-3bfc6463f8c1")
    private static String[] _poolMgtPolicyKind = {
        "inifiniteWait",
        "timedWait",
        "dynamic",
        "exception",
        "other"};

    @objid ("0349ed5e-58ac-49f6-ad70-e4f475bab31b")
    private static String[] _callConcurrencyKind = {
        "sequential",
        "guarded",
        "concurrent"};

    @objid ("602fab7f-83e1-4eda-ab49-bd328ea77a92")
    private static String[] _synchronisationKind = {
        "synchronous",
        "asynchronous",
        "delayedSynchronous",
        "rendezVous",
        "other"};

    @objid ("9284758c-5639-443d-9645-8339eee9e017")
    private static String[] _executionKind = {
        "deferred",
        "remoteImmediate",
        "localImmediate"};

    @objid ("7e7604d0-5d27-450a-817a-4b07bc8b9379")
    private static String[] _concurrencyKind = {
        "reader",
        "writer",
        "parallel"};

    @objid ("52b0c9c9-9392-40fb-96a1-a8f152133cc5")
    private static String[] _iSA_Type = {
        "RISC",
        "CISC",
        "VLIW",
        "SIMD",
        "other",
        "undef"};

    @objid ("9ccfae15-fad9-47c2-8b84-d69e30a2be04")
    private static String[] _pLD_Technology = {
        "SRAM",
        "antifuse",
        "flash",
        "other",
        "undef"};

    @objid ("60e96b55-9fea-4fde-93e6-9faf2a55bab5")
    private static String[] _pLD_Class = {
        "symetricalArray",
        "rowBased",
        "seaOfGates",
        "hierarchicalPLD",
        "other",
        "undef"};

    @objid ("38f46e2c-300c-4a86-b406-678052b0cd34")
    private static String[] _repl_Policy = {
        "LRU",
        "NFU",
        "FIFO",
        "random",
        "other",
        "undef"};

    @objid ("1e409f34-177e-44bf-a862-19d7ee041b68")
    private static String[] _writePolicy = {
        "writeBack",
        "writeThrough",
        "other",
        "undef"};

    @objid ("415b0b0d-2b23-4f06-a088-4fc06b6ed19c")
    private static String[] _cacheType = {
        "data",
        "instruction",
        "unified",
        "other",
        "undef"};

    @objid ("07182a41-61d2-400e-aebb-c25478034585")
    private static String[] _rOM_Type = {
        "maskedROM",
        "EPROM",
        "OTP_EPROM",
        "EEPROM",
        "flash",
        "other",
        "undefined"};

    @objid ("8732f7d7-05ac-41f4-81d1-76daa98f9534")
    private static String[] _componentKind = {
        "card",
        "channel",
        "chip",
        "port",
        "unit",
        "other",
        "undef"};

    @objid ("a6fdaa15-a716-400d-a2fe-58737483fcc7")
    private static String[] _interruptKind = {
        "HardWareInterruption",
        "ProcessorDetectedException",
        "ProgrammedException",
        "Undef",
        "Other"};

    @objid ("3dc0ad6d-aeac-4181-b09a-52bd9c31eaa7")
    private static String[] _messageResourceKind = {
        "MessageQueue",
        "Pipe",
        "Blackboard",
        "Undef",
        "Other"};

    @objid ("d271c29d-ab91-4726-b869-fb215666b00a")
    private static String[] _notificationKind = {
        "Memorized",
        "Bounded",
        "Memoryless",
        "Undef",
        "Other"};

    @objid ("09c910b1-ffab-4fee-9cee-0b2e68908523")
    private static String[] _notificationResourceKind = {
        "Event",
        "Barrier",
        "Undef",
        "Other"};

    @objid ("9e4ec17c-5546-4234-9f02-deb91de8c056")
    private static String[] _mutualExclusionResourceKind = {
        "BooleanSemaphore",
        "CountSemaphore",
        "Mutex",
        "Undef",
        "Other"};

    @objid ("e9dbad2e-323a-4e63-ad9a-886c78cd63ae")
    private static String[] _concurrentAccessProtocolKind = {
        "PIP",
        "PCP",
        "NoPreemption",
        "Undef",
        "Other"};

    @objid ("407a25ed-076a-42d1-b1ae-f12f1b6c7004")
    private static String[] _queuePolicyKind = {
        "FIFO",
        "LIFO",
        "Priority",
        "Undef",
        "Other"};

    @objid ("b0195d1b-950e-4ca0-8b51-76d9dcd73dfd")
    private static String[] _variableDirectionKind = {
        "in", 
        "out", 
        "inout"};

    @objid ("2f2260eb-3416-4ea2-a45d-993a4b15658c")
    private static String[] _mutualExclusionresKind = {
        "BooleanSemaphore", 
        "CountSemaphore", 
        "Mutex", 
        "Undef", 
        "Other"};

    @objid ("ddd4caa8-99ea-491c-b5bd-d791d53d39c9")
    private static String[] _dataPoolOrderingKind = {
        "FIFO", 
        "LIFO", 
        "UserDefined"};

    @objid ("462293e8-2b9f-4eb3-8114-07db938355c7")
    private static String[] _flowDirectionKind = {
        "in",
        "out",
        "inout"};

    @objid ("07115daa-3612-41ce-854f-0989c0c317ca")
    private static String[] _clientServerKind = {
        "provided",
        "required",
        "proreq"};

    @objid ("2465ea8b-681c-4ca9-a84c-8ac797e43da7")
    private static String[] _portSpecificationKind = {
        "atomic",
        "interfaceBased",
        "featureBased"};

    @objid ("59b1fcab-8cca-43d5-b221-7f40381831fd")
    private static String[] _optimallityCriterionKind = {
        "meeetHardDeadlines",
        "minimizeMissedDeadlines",
        "minimizeMeanTardiness",
        "undef",
        "other"};

    @objid ("42d58f7c-fe1f-420b-b95f-5cac1e8b575e")
    private static String[] _timeNatureKind = {"discrete","dense"};

    @objid ("477f2d3a-7a7c-45bf-b2da-4d2e30b1308f")
    public static boolean isTimeNatureKind(final String totest) {
        for (String  value : _timeNatureKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("3cc0ed3d-d5b5-43f1-85a3-acde0b00cf79")
    public static String[] getTimeNatureKind() {
        return _timeNatureKind;
    }

    @objid ("570bcbfa-a76b-4710-9f36-3e7593829d1c")
    public static boolean isEventKind(final String totest) {
        for (String  value : _eventKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("ed3ef6f2-c97b-4a43-9b9e-47853eaf458d")
    public static String[] getEventKind() {
        return _eventKind;
    }

    @objid ("9ca20a00-359b-4997-9758-e2ba114b2cc4")
    public static boolean isOptimallityCriterionKind(final String totest) {
        for (String  value : _optimallityCriterionKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("d5fda7ed-5d99-4e45-87e3-6c47bf7e38f2")
    public static String[] getOptimallityCriterionKind() {
        return _optimallityCriterionKind;
    }

    @objid ("fe73341e-24ea-4814-ab91-b813462fcf69")
    public static boolean isTimeInterpretationKind(final String totest) {
        for (String  value : _timeInterpretationKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("49630182-1818-4c06-887a-410e1d281a51")
    public static String[] getTimeInterpretationKind() {
        return _timeInterpretationKind;
    }

    @objid ("c325e948-a356-49d1-b0a9-9c619886371b")
    public static boolean isAllocationKind(final String totest) {
        for (String  value : _allocationKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("cd98abfe-ce0f-4964-9069-ada7b6c6fb68")
    public static String[] getAllocationKind() {
        return _allocationKind;
    }

    @objid ("49e4fe22-5c49-4236-8369-6fbca4595390")
    public static boolean isLaxityKind(final String totest) {
        for (String  value : _laxityKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("604b733f-80dc-432b-9ddc-f80b836efc4c")
    public static String[] getLaxityKind() {
        return _laxityKind;
    }

    @objid ("9e16d8f5-c7d5-4011-8fb4-fe48e805f18b")
    public static boolean isAllocationEndKind(final String totest) {
        for (String  value : _allocationEndKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("458c7409-17a4-4c00-8d8d-6372522e5cb9")
    public static String[] getAllocationEndKind() {
        return _allocationEndKind;
    }

    @objid ("a42c5a54-2d74-4581-a51c-982ddbb05f8b")
    public static boolean isAllocationNature(final String totest) {
        for (String  value : _allocationNature){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("ab0ed1bf-9166-47c1-a39c-980064af7983")
    public static String[] getAllocationNature() {
        return _allocationNature;
    }

    @objid ("9137914e-9cc6-4f52-88c5-910a94bc6255")
    public static boolean isSchedPolicyKind(final String totest) {
        for (String  value : _schedPolicyKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("1cbd7b19-59d0-4970-af40-883ec89495e0")
    public static String[] getSchedPolicyKind() {
        return _schedPolicyKind;
    }

    @objid ("a9482866-2269-4098-9f56-7857d83c26ca")
    public static boolean isProtectProtocolKind(final String totest) {
        for (String  value : _protectProtocolKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("3db5292a-b9a4-4247-9ebc-cfd1055ab990")
    public static String[] getProtectProtocolKind() {
        return _protectProtocolKind;
    }

    @objid ("82ae63db-3cf7-4746-8e44-c6b52f823218")
    public static boolean isPoolMgtPolicyKind(final String totest) {
        for (String  value : _poolMgtPolicyKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("0575c813-081e-4a81-9220-4ce49b15e017")
    public static String[] getPoolMgtPolicyKind() {
        return _poolMgtPolicyKind;
    }

    @objid ("d801515b-0697-4490-85f1-b7d32c2ad0a4")
    public static boolean isCallConcurrencyKind(final String totest) {
        for (String  value : _callConcurrencyKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("a9112104-acc3-4df1-a63f-a8654017cb3a")
    public static String[] getCallConcurrencyKind() {
        return _callConcurrencyKind;
    }

    @objid ("783d1237-99c8-439c-9645-2cc38ab6ab9e")
    public static boolean isSynchronisationKind(final String totest) {
        for (String  value : _synchronisationKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("275be5fe-f386-4773-9c3b-1ba91af149d0")
    public static String[] getSynchronisationKind() {
        return _synchronisationKind;
    }

    @objid ("627df2ec-6dd1-4cc1-86b2-d2f6dfe47e75")
    public static boolean isExecutionKind(final String totest) {
        for (String  value : _executionKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("eaee8d28-d282-4aa6-838d-013f3437d166")
    public static String[] getExecutionKind() {
        return _executionKind;
    }

    @objid ("130a3076-c115-442d-b58e-c68064247cdf")
    public static boolean isConcurrencyKind(final String totest) {
        for (String  value : _concurrencyKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("1115b32d-66ab-4791-8df0-da8759d07144")
    public static String[] getConcurrencyKind() {
        return _concurrencyKind;
    }

    @objid ("eb242a7f-4646-4812-ae24-779ff0a6004d")
    public static boolean isISA_Type(final String totest) {
        for (String  value : _iSA_Type){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("f3c80eeb-0dab-48a9-85e9-939c5e983c31")
    public static String[] getISA_Type() {
        return _iSA_Type;
    }

    @objid ("5b5b0d88-4cbe-4273-99f0-81abb8dc086d")
    public static boolean isPLD_Technology(final String totest) {
        for (String  value : _pLD_Technology){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("01135432-d214-44a3-8fe6-57b9ece08738")
    public static String[] getPLD_Class() {
        return _pLD_Class;
    }

    @objid ("c97c68d5-2b7f-438c-bd36-7696a2d08fe9")
    public static boolean isPLD_Class(final String totest) {
        for (String  value : _pLD_Class){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("f666fac1-9289-4cb3-a3a2-b1a9cdc1717e")
    public static String[] getPLD_Technology() {
        return _pLD_Technology;
    }

    @objid ("907718f4-8166-4775-a37b-f29537463b0f")
    public static boolean isRepl_Policy(final String totest) {
        for (String  value : _repl_Policy){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("80775a98-52f8-4afe-bde0-e634f5799e1a")
    public static String[] getRepl_Policy() {
        return _repl_Policy;
    }

    @objid ("de412b15-54bd-42ce-bd8e-27f1e615bb54")
    public static boolean isWritePolicy(final String totest) {
        for (String  value : _writePolicy){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("b4656250-d615-4ca8-af88-d7d6e7bd7a07")
    public static String[] getWritePolicy() {
        return _writePolicy;
    }

    @objid ("324fc584-d05f-4707-a01f-3272f9ae8a72")
    public static boolean isCacheType(final String totest) {
        for (String  value : _cacheType){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("7e66c7d8-89b7-4f06-8b57-019fb3f9dd47")
    public static String[] getCacheType() {
        return _cacheType;
    }

    @objid ("277a0b57-8be4-4e5e-a484-15d44ce8a581")
    public static boolean isROM_Type(final String totest) {
        for (String  value : _rOM_Type){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("01ed079c-be54-4ba5-958c-d9908f02be02")
    public static String[] getROM_Type() {
        return _rOM_Type;
    }

    @objid ("319bab6f-68c3-4db6-a1d8-b6c8cd47522f")
    public static boolean isComponentKind(final String totest) {
        for (String  value : _componentKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("f73f9897-cb5d-4d79-9691-af890ca09aa5")
    public static String[] getComponentKind() {
        return _componentKind;
    }

    @objid ("17fc5aac-42f8-4a50-af31-da7c68271bfd")
    public static boolean isInterruptKind(final String totest) {
        for (String  value : _interruptKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("5040cf41-3b44-472b-bb3d-83bb6413133c")
    public static String[] getInterruptKind() {
        return _interruptKind;
    }

    @objid ("c530f84c-a446-4839-b376-776c7bdbe022")
    public static boolean isMessageResourceKind(final String totest) {
        for (String  value : _messageResourceKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("ec5c6191-5824-4e39-bf85-e60003cb5ec1")
    public static String[] getMessageResourceKind() {
        return _messageResourceKind;
    }

    @objid ("aeea9bce-ed97-414a-acff-e55f8752bf76")
    public static boolean isNotificationKind(final String totest) {
        for (String  value : _notificationKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("5f16ae8f-8fba-4ce0-b49c-53e9e81786fb")
    public static String[] getNotificationKind() {
        return _notificationKind;
    }

    @objid ("952a4da8-abde-4666-a329-6eef0912ad43")
    public static boolean isNotificationResourceKind(final String totest) {
        for (String  value : _notificationResourceKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("d5aaee89-639a-4438-85ea-4d9723cfcb1e")
    public static String[] getNotificationResourceKind() {
        return _notificationResourceKind;
    }

    @objid ("410216e3-e25a-4569-bdd2-3c02f85d03ee")
    public static boolean isMutualExclusionResourceKind(final String totest) {
        for (String  value : _mutualExclusionResourceKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("7e0ca203-6482-4c17-808a-986fc1f60ede")
    public static String[] getMutualExclusionResourceKind() {
        return _mutualExclusionResourceKind;
    }

    @objid ("fdfc0a57-c9e7-4dec-af4e-6c8b59c1351d")
    public static boolean isConcurrentAccessProtocolKind(final String totest) {
        for (String  value : _concurrentAccessProtocolKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("6321897a-4f25-42f1-9f1f-24abe66a7698")
    public static String[] getConcurrentAccessProtocolKind() {
        return _concurrentAccessProtocolKind;
    }

    @objid ("71a6cf3a-2f47-4046-8787-f532f8551aa4")
    public static boolean isQueuePolicyKind(final String totest) {
        for (String  value : _queuePolicyKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("4588d98c-4d2a-470c-ac7c-bf62c70e23c2")
    public static String[] getQueuePolicyKind() {
        return _queuePolicyKind;
    }

    @objid ("8f6a2a60-3f1e-4688-a676-f52995e88cf3")
    public static boolean isTransModeKind(final String totest) {
        for (String  value : _transmModeKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("8a086140-eadf-41f9-961c-f52d899c96ec")
    public static String[] getTransmModeKind() {
        return _transmModeKind;
    }

    @objid ("d9016fb5-a275-4c61-8761-953639c3005e")
    public static boolean isVariableDirectionKind(final String totest) {
        for (String  value : _variableDirectionKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("ac818e9c-8483-4f56-a024-23d7c4374895")
    public static String[] getVariableDirectionKind() {
        return _variableDirectionKind;
    }

    @objid ("edcc0f95-4622-4d88-a8f4-ffc68a9a24d7")
    public static boolean isMutualExclusionresKind(final String totest) {
        for (String  value : _mutualExclusionresKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("fd82ad69-4ff2-408a-9d8e-1f386f24d1a3")
    public static String[] getMutualExclusionresKind() {
        return _mutualExclusionresKind;
    }

    @objid ("be633466-1aa7-4ed6-9973-cd485ee1dad2")
    public static boolean isDataPoolOderingKind(final String totest) {
        for (String  value : _dataPoolOrderingKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("c6e99f8e-b116-4acb-9dbd-f5ac2e412b74")
    public static String[] getDataPoolOderingKind() {
        return _dataPoolOrderingKind;
    }

    @objid ("c7f7db34-8c65-4c58-9b75-74df3d8c0e43")
    public static boolean isFlowDirectionKind(final String totest) {
        for (String  value : _flowDirectionKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("61904ab1-eec2-44c3-b284-e466498e15df")
    public static String[] getFlowDirectionKind() {
        return _flowDirectionKind;
    }

    @objid ("1cdcae1b-ce98-4086-9666-aeaf02d2a27a")
    public static boolean isPortSpecificationKind(final String totest) {
        for (String  value : _portSpecificationKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("0e67761e-f219-4169-a9bd-cc3da37084f2")
    public static String[] getPortSpecificationKind() {
        return _portSpecificationKind;
    }

    @objid ("f4378bad-799d-46d4-b544-480b46bd7b74")
    public static boolean isClientServerKind(final String totest) {
        for (String  value : _clientServerKind){
            if (totest.equals(value.toString()))
                return true;
        }
        return false;
    }

    @objid ("90fd95b9-8e35-4be9-887f-814f0906dacc")
    public static String[] getClientServerKind() {
        return _clientServerKind;
    }

}
