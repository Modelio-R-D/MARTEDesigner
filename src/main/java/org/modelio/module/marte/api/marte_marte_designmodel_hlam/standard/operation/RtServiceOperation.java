/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Operation} with << RtService_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3fbd5f30-bcba-49ae-a373-ba02fc193fa5")
public class RtServiceOperation {
    @objid ("ebe5e1ac-82b1-4453-bc26-fd1b3c0dd398")
    public static final String STEREOTYPE_NAME = "RtService_Operation";

    @objid ("830a6694-bdc0-4ff2-90c7-f89520ccfba2")
    public static final String RTSERVICE_OPERATION_CONCPOLICY_TAGTYPE = "RtService_Operation_concPolicy";

    @objid ("e4f7c5ac-9d19-4a18-86ae-c95a01fe7e3a")
    public static final String RTSERVICE_OPERATION_EXEKIND_TAGTYPE = "RtService_Operation_exeKind";

    @objid ("5e95a830-512a-45b9-85c8-21c934b1282f")
    public static final String RTSERVICE_OPERATION_ISATOMIC_TAGTYPE = "RtService_Operation_isAtomic";

    @objid ("08846f8c-fd71-4ba7-b48b-a8c2014d723d")
    public static final String RTSERVICE_OPERATION_SYNCHKIND_TAGTYPE = "RtService_Operation_synchKind";

    /**
     * The underlying {@link Operation} represented by this proxy, never null.
     */
    @objid ("f6840230-ea8b-4abe-b051-2b993f273add")
    protected final Operation elt;

    /**
     * Tells whether a {@link RtServiceOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << RtService_Operation >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5a5d4491-4244-4294-9106-d7de4dabf187")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtServiceOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << RtService_Operation >> then instantiate a {@link RtServiceOperation} proxy.
     * 
     * @return a {@link RtServiceOperation} proxy on the created {@link Operation}.
     */
    @objid ("df10ea87-4bc8-4c4b-9a3a-3f5a447ccc9b")
    public static RtServiceOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtServiceOperation.STEREOTYPE_NAME);
        return RtServiceOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link RtServiceOperation} proxy from a {@link Operation} stereotyped << RtService_Operation >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link RtServiceOperation} proxy or <i>null</i>.
     */
    @objid ("d89fa34d-799f-4c32-8fb5-bc7329f4383f")
    public static RtServiceOperation instantiate(final Operation obj) {
        return RtServiceOperation.canInstantiate(obj) ? new RtServiceOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtServiceOperation} proxy from a {@link Operation} stereotyped << RtService_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link RtServiceOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7abb7829-9ecd-4b77-a183-d7b910655e60")
    public static RtServiceOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (RtServiceOperation.canInstantiate(obj))
        	return new RtServiceOperation(obj);
        else
        	throw new IllegalArgumentException("RtServiceOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2990f52d-69bf-4a30-a961-3a80b5e3e97f")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        RtServiceOperation other = (RtServiceOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @objid ("f310a014-2a06-48f1-bce4-9b7046b78368")
    public Operation getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtService_Operation_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e15ebc3d-3e99-48d7-a4fd-5f45163c0c83")
    public String getRtService_Operation_concPolicy() {
        return this.elt.getTagValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_CONCPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtService_Operation_exeKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c4d48669-6d31-429b-b99e-3f120a12b4a7")
    public String getRtService_Operation_exeKind() {
        return this.elt.getTagValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_EXEKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtService_Operation_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58adcdb4-a492-432c-87ba-4c51a3211aa5")
    public String getRtService_Operation_synchKind() {
        return this.elt.getTagValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_SYNCHKIND_TAGTYPE_ELT);
    }

    @objid ("edf1681e-7ab8-4b7f-8eea-8a6a14824a4b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtService_Operation_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("57b4c5e2-d3e8-43b1-b13a-cb719f93db17")
    public boolean isRtService_Operation_isAtomic() {
        return this.elt.isTagged(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtService_Operation_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b057a28-6990-4780-adf4-ff6f65343264")
    public void setRtService_Operation_concPolicy(final String value) {
        this.elt.putTagValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_CONCPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtService_Operation_exeKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e44309a-c5ca-4085-8874-55648b69225f")
    public void setRtService_Operation_exeKind(final String value) {
        this.elt.putTagValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_EXEKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'RtService_Operation_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1096afb-d5f3-42d7-9ae8-5a5abc920416")
    public void setRtService_Operation_isAtomic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_ISATOMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtService_Operation_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd2c6caa-1769-42f9-a4ae-dca077d98112")
    public void setRtService_Operation_synchKind(final String value) {
        this.elt.putTagValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_SYNCHKIND_TAGTYPE_ELT, value);
    }

    @objid ("c0a25502-81ed-4357-9882-816304464720")
    protected RtServiceOperation(final Operation elt) {
        this.elt = elt;
    }

    @objid ("02227877-ca86-48b5-9f10-0621238d074c")
    public static final class MdaTypes {
        @objid ("7b86a3ae-7462-4f96-a4f0-b3dbb80af144")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2aadcd4e-9de4-428e-8f2d-e8fd97c80069")
        public static TagType RTSERVICE_OPERATION_CONCPOLICY_TAGTYPE_ELT;

        @objid ("93fcf4ce-50d9-4611-8135-d2144682c11b")
        public static TagType RTSERVICE_OPERATION_EXEKIND_TAGTYPE_ELT;

        @objid ("5d0528be-dbf7-415a-a6de-b68614604bbb")
        public static TagType RTSERVICE_OPERATION_ISATOMIC_TAGTYPE_ELT;

        @objid ("5be9f740-018c-4fc9-81b7-c28577e253d1")
        public static TagType RTSERVICE_OPERATION_SYNCHKIND_TAGTYPE_ELT;

        @objid ("9ee48fb3-795e-4ba8-8a55-83e712da26ab")
        private static Stereotype MDAASSOCDEP;

        @objid ("dd8fe25b-d535-43bb-9057-3176b108b888")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ca075d34-b9d6-4cfc-b07b-2c31688d5d40")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00cef7df-0ccf-11df-8525-001302895b2b");
            RTSERVICE_OPERATION_CONCPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00cef7e0-0ccf-11df-8525-001302895b2b");
            RTSERVICE_OPERATION_EXEKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00cef7e1-0ccf-11df-8525-001302895b2b");
            RTSERVICE_OPERATION_ISATOMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00cef7e2-0ccf-11df-8525-001302895b2b");
            RTSERVICE_OPERATION_SYNCHKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00d15a2c-0ccf-11df-8525-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
