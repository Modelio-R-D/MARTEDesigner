/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.collaboration;

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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Collaboration} with << RtUnit_Collaboration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("eeed40c9-d0df-41a6-ad1e-5f4fd612d547")
public class RtUnitCollaboration {
    @objid ("d6650c00-88a3-4bb9-b08d-a03900c9c50d")
    public static final String STEREOTYPE_NAME = "RtUnit_Collaboration";

    @objid ("6382ba82-86b3-49ac-b78e-2c978a5f992f")
    public static final String RTUNIT_COLLABORATION_ISDYNAMIC_TAGTYPE = "RtUnit_Collaboration_isDynamic";

    @objid ("4715fa38-73ce-4d43-a3a0-a20d25ca1a1c")
    public static final String RTUNIT_COLLABORATION_ISMAIN_TAGTYPE = "RtUnit_Collaboration_isMain";

    @objid ("1f1c2f6f-ea2e-4539-b68e-1c3471fe6c6f")
    public static final String RTUNIT_COLLABORATION_MAIN_TAGTYPE = "RtUnit_Collaboration_main";

    @objid ("588dfe51-fd9b-4094-b357-b542aded36df")
    public static final String RTUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE = "RtUnit_Collaboration_memorySize";

    @objid ("ecbd0aed-6cea-4620-ac36-9abc900c974a")
    public static final String RTUNIT_COLLABORATION_MSGMAXSIZE_TAGTYPE = "RtUnit_Collaboration_msgMaxSize";

    @objid ("735b09f5-06e5-4b0e-b845-87dcd854a379")
    public static final String RTUNIT_COLLABORATION_OPERATIONALMODE_TAGTYPE = "RtUnit_Collaboration_operationalMode";

    @objid ("ecf6fef8-659a-4688-8fc2-abc0bd17eb9d")
    public static final String RTUNIT_COLLABORATION_QUEUESCHEDPOLICY_TAGTYPE = "RtUnit_Collaboration_queueSchedPolicy";

    @objid ("7d403bd1-e805-41f9-bd5d-d656c17c37c0")
    public static final String RTUNIT_COLLABORATION_QUEUESIZE_TAGTYPE = "RtUnit_Collaboration_queueSize";

    @objid ("03e29c29-4885-45fe-b66a-345bee7ced8f")
    public static final String RTUNIT_COLLABORATION_SRPOOLPOLICY_TAGTYPE = "RtUnit_Collaboration_srPoolPolicy";

    @objid ("c84cd9f8-267e-4f76-88c3-e52c4b21bebf")
    public static final String RTUNIT_COLLABORATION_SRPOOLSIZE_TAGTYPE = "RtUnit_Collaboration_srPoolSize";

    @objid ("f7ade27c-755b-45c5-9bdf-418f3f5c311b")
    public static final String RTUNIT_COLLABORATION_SRPOOLWAITINGTIME_TAGTYPE = "RtUnit_Collaboration_srPoolWaitingTime";

    /**
     * The underlying {@link Collaboration} represented by this proxy, never null.
     */
    @objid ("1bc882ba-84e4-46ab-8393-1c28c437e115")
    protected final Collaboration elt;

    /**
     * Tells whether a {@link RtUnitCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << RtUnit_Collaboration >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("526f08de-c9c0-40a7-bd84-f6b8eb304614")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << RtUnit_Collaboration >> then instantiate a {@link RtUnitCollaboration} proxy.
     * 
     * @return a {@link RtUnitCollaboration} proxy on the created {@link Collaboration}.
     */
    @objid ("f29b0b63-51c3-4954-b843-65826016a0e4")
    public static RtUnitCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitCollaboration.STEREOTYPE_NAME);
        return RtUnitCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link RtUnitCollaboration} proxy from a {@link Collaboration} stereotyped << RtUnit_Collaboration >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link RtUnitCollaboration} proxy or <i>null</i>.
     */
    @objid ("33fdde27-d768-4588-8568-1b449f25d8c3")
    public static RtUnitCollaboration instantiate(final Collaboration obj) {
        return RtUnitCollaboration.canInstantiate(obj) ? new RtUnitCollaboration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtUnitCollaboration} proxy from a {@link Collaboration} stereotyped << RtUnit_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Collaboration}
     * @return a {@link RtUnitCollaboration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b2ae4fd1-17a3-4c81-b9f1-f384f7c4eb58")
    public static RtUnitCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (RtUnitCollaboration.canInstantiate(obj))
        	return new RtUnitCollaboration(obj);
        else
        	throw new IllegalArgumentException("RtUnitCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("20d8cd62-3654-47d7-81e0-59b3de2c0c3d")
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
        RtUnitCollaboration other = (RtUnitCollaboration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    @objid ("0324141d-0081-4ce1-9ceb-decc70696b90")
    public Collaboration getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6dadebb4-61dc-444c-8a09-1eaedb2af72a")
    public String getRtUnit_Collaboration_main() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_MAIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76fd1d9e-704a-4008-b484-12a3081cf2dd")
    public String getRtUnit_Collaboration_memorySize() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9ea036c-892c-41b2-b9d0-f3977887fe65")
    public String getRtUnit_Collaboration_msgMaxSize() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_MSGMAXSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70536849-dbc9-4ca2-807d-0ef92120ab5e")
    public String getRtUnit_Collaboration_operationalMode() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_OPERATIONALMODE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a05bcf70-4395-4c89-9273-ca89c438c081")
    public String getRtUnit_Collaboration_queueSchedPolicy() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_QUEUESCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7762af15-4e28-40cb-9d69-3f498bcd2cb4")
    public String getRtUnit_Collaboration_queueSize() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_QUEUESIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ef49c302-f6aa-4fba-874b-f637de1a5c6f")
    public String getRtUnit_Collaboration_srPoolPolicy() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_SRPOOLPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4935aa2a-fa9b-4b1b-a1a8-229b48317568")
    public String getRtUnit_Collaboration_srPoolSize() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_SRPOOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7035962d-2e52-4bb7-a05e-c0161642698d")
    public String getRtUnit_Collaboration_srPoolWaitingTime() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_SRPOOLWAITINGTIME_TAGTYPE_ELT);
    }

    @objid ("8e97e41c-c533-425b-9fc0-c6ae46dac952")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtUnit_Collaboration_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c1b7e2d-cfad-44d1-a32f-6ecf9661a770")
    public boolean isRtUnit_Collaboration_isDynamic() {
        return this.elt.isTagged(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'RtUnit_Collaboration_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("800fe724-7a17-457c-b866-62a007ba8c57")
    public boolean isRtUnit_Collaboration_isMain() {
        return this.elt.isTagged(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Collaboration_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be5ca2ba-8cc5-4fb4-86e2-a6d29e5edead")
    public void setRtUnit_Collaboration_isDynamic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_ISDYNAMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Collaboration_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c980627d-912c-4e16-806f-a76156a14737")
    public void setRtUnit_Collaboration_isMain(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_ISMAIN_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("844e7d09-0cff-4317-b689-6f1225ec6768")
    public void setRtUnit_Collaboration_main(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_MAIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70cf0bce-43c5-4dbd-95fb-d267d7b4ba79")
    public void setRtUnit_Collaboration_memorySize(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("85dbc092-206c-43bb-a9f9-d5399ba5cb3c")
    public void setRtUnit_Collaboration_msgMaxSize(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_MSGMAXSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e1df0fc-4f02-45a0-8111-fe42f6b2e741")
    public void setRtUnit_Collaboration_operationalMode(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_OPERATIONALMODE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cc23659e-a695-4396-97ae-a60b5c989a7a")
    public void setRtUnit_Collaboration_queueSchedPolicy(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_QUEUESCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd2eb3a6-14c4-4073-a2f1-72da399a6fff")
    public void setRtUnit_Collaboration_queueSize(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_QUEUESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("23ffa68c-55bb-4724-9936-be9e321a15e5")
    public void setRtUnit_Collaboration_srPoolPolicy(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_SRPOOLPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6266a7bb-923f-44ce-91bd-da783cfac64e")
    public void setRtUnit_Collaboration_srPoolSize(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_SRPOOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aa3bed83-5f89-4ff5-9ab2-09fce1178d3c")
    public void setRtUnit_Collaboration_srPoolWaitingTime(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_SRPOOLWAITINGTIME_TAGTYPE_ELT, value);
    }

    @objid ("e08f89b6-0b7d-422d-b7e9-c419f9b53573")
    protected RtUnitCollaboration(final Collaboration elt) {
        this.elt = elt;
    }

    @objid ("52619811-9490-4936-9908-c70aae926b79")
    public static final class MdaTypes {
        @objid ("29276254-c96d-4fce-acc4-48e8ca71b7e6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("290305c6-f3f6-4cbc-a81f-af20091295ab")
        public static TagType RTUNIT_COLLABORATION_ISDYNAMIC_TAGTYPE_ELT;

        @objid ("ac354c9e-afef-4dce-a3c9-592ab820fb53")
        public static TagType RTUNIT_COLLABORATION_ISMAIN_TAGTYPE_ELT;

        @objid ("43fa58ca-2786-435a-9f0a-f3cc30d08cce")
        public static TagType RTUNIT_COLLABORATION_SRPOOLSIZE_TAGTYPE_ELT;

        @objid ("31346d1c-db35-4076-aba6-d42148561d86")
        public static TagType RTUNIT_COLLABORATION_SRPOOLPOLICY_TAGTYPE_ELT;

        @objid ("b128c0ad-a991-4caa-a08d-88b5b4f15c9f")
        public static TagType RTUNIT_COLLABORATION_SRPOOLWAITINGTIME_TAGTYPE_ELT;

        @objid ("90a92c2f-9bb3-4975-affd-ef3a5e32ad34")
        public static TagType RTUNIT_COLLABORATION_QUEUESCHEDPOLICY_TAGTYPE_ELT;

        @objid ("f7a05a38-df10-4c63-acdb-98739edaeb81")
        public static TagType RTUNIT_COLLABORATION_QUEUESIZE_TAGTYPE_ELT;

        @objid ("3b560a44-a4a6-494f-9e02-6383539c57a9")
        public static TagType RTUNIT_COLLABORATION_MSGMAXSIZE_TAGTYPE_ELT;

        @objid ("fcd87d0b-9fe7-4293-8fc2-0110ea163593")
        public static TagType RTUNIT_COLLABORATION_OPERATIONALMODE_TAGTYPE_ELT;

        @objid ("60d6acfa-a9f6-41e2-824a-d3de1380f3bb")
        public static TagType RTUNIT_COLLABORATION_MAIN_TAGTYPE_ELT;

        @objid ("7a915846-cc09-4670-8b33-a15f7a02e913")
        public static TagType RTUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("706a9b05-6cc9-4488-b0aa-3d4cc645d6f1")
        private static Stereotype MDAASSOCDEP;

        @objid ("a62f5a74-cb9a-4a02-9d24-36777630b5b7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f61437d7-a318-4ffe-8667-548386ddeda1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "51e2c9c5-0ce9-11df-b742-001302895b2b");
            RTUNIT_COLLABORATION_ISDYNAMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "51e2c9c6-0ce9-11df-b742-001302895b2b");
            RTUNIT_COLLABORATION_ISMAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "51e2c9c7-0ce9-11df-b742-001302895b2b");
            RTUNIT_COLLABORATION_SRPOOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "51e2c9c8-0ce9-11df-b742-001302895b2b");
            RTUNIT_COLLABORATION_SRPOOLPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "51e2c9c9-0ce9-11df-b742-001302895b2b");
            RTUNIT_COLLABORATION_SRPOOLWAITINGTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "51e2c9ca-0ce9-11df-b742-001302895b2b");
            RTUNIT_COLLABORATION_QUEUESCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d76d0e1-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_COLLABORATION_QUEUESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d76d0df-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_COLLABORATION_MSGMAXSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d76d0e0-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_COLLABORATION_OPERATIONALMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "51e2c9cb-0ce9-11df-b742-001302895b2b");
            RTUNIT_COLLABORATION_MAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "51e2c9cc-0ce9-11df-b742-001302895b2b");
            RTUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "51e2c9cd-0ce9-11df-b742-001302895b2b");
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
