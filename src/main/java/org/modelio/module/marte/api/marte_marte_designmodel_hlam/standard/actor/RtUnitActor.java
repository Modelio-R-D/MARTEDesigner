/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.actor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Actor} with << RtUnit_Actor >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ff75ccda-3f5c-4b3c-8de9-caccf161fa3a")
public class RtUnitActor {
    @objid ("d174e2bc-cd7e-4c85-aaf6-98e08d73906c")
    public static final String STEREOTYPE_NAME = "RtUnit_Actor";

    @objid ("d32879c7-5aaa-46cf-9d35-4f592a7fcf16")
    public static final String RTUNIT_ACTOR_ISDYNAMIC_TAGTYPE = "RtUnit_Actor_isDynamic";

    @objid ("1343eab4-4491-4198-a108-4bf5c894cf8b")
    public static final String RTUNIT_ACTOR_ISMAIN_TAGTYPE = "RtUnit_Actor_isMain";

    @objid ("fa2d1801-fac5-4efe-b83a-7efc2527117c")
    public static final String RTUNIT_ACTOR_MAIN_TAGTYPE = "RtUnit_Actor_main";

    @objid ("37a0f1b1-eb51-4996-a472-cb36dad1ff7f")
    public static final String RTUNIT_ACTOR_MEMORYSIZE_TAGTYPE = "RtUnit_Actor_memorySize";

    @objid ("86b92c55-a1a8-44a7-ae13-5a14f556b3c1")
    public static final String RTUNIT_ACTOR_MSGMAXSIZE_TAGTYPE = "RtUnit_Actor_msgMaxSize";

    @objid ("bd544f3e-b474-45aa-8693-d63d124cad78")
    public static final String RTUNIT_ACTOR_OPERATIONALMODE_TAGTYPE = "RtUnit_Actor_operationalMode";

    @objid ("b77e20dc-163f-49ae-a04c-0a871f64f0a4")
    public static final String RTUNIT_ACTOR_QUEUESCHEDPOLICY_TAGTYPE = "RtUnit_Actor_queueSchedPolicy";

    @objid ("2a44f0a5-8c64-483b-bec2-eafffa249f0e")
    public static final String RTUNIT_ACTOR_QUEUESIZE_TAGTYPE = "RtUnit_Actor_queueSize";

    @objid ("4c718d4b-4480-4cf5-aa04-bd288fc88cd9")
    public static final String RTUNIT_ACTOR_SRPOOLPOLICY_TAGTYPE = "RtUnit_Actor_srPoolPolicy";

    @objid ("e193ce2f-996d-42e9-8fe7-53ec579c89a8")
    public static final String RTUNIT_ACTOR_SRPOOLSIZE_TAGTYPE = "RtUnit_Actor_srPoolSize";

    @objid ("5fd13d19-49c6-4b2f-bcfb-cd537e28cbee")
    public static final String RTUNIT_ACTOR_SRPOOLWAITINGTIME_TAGTYPE = "RtUnit_Actor_srPoolWaitingTime";

    /**
     * The underlying {@link Actor} represented by this proxy, never null.
     */
    @objid ("c2722c5e-1fa7-4e82-80f2-1d672768c913")
    protected final Actor elt;

    /**
     * Tells whether a {@link RtUnitActor proxy} can be instantiated from a {@link MObject} checking it is a {@link Actor} stereotyped << RtUnit_Actor >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("564c0bb1-2afc-4d77-9785-557f72480390")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Actor) && ((Actor) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitActor.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Actor} stereotyped << RtUnit_Actor >> then instantiate a {@link RtUnitActor} proxy.
     * 
     * @return a {@link RtUnitActor} proxy on the created {@link Actor}.
     */
    @objid ("31b6ce59-f8d5-4e95-9fe8-405a7768c59c")
    public static RtUnitActor create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Actor");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitActor.STEREOTYPE_NAME);
        return RtUnitActor.instantiate((Actor)e);
    }

    /**
     * Tries to instantiate a {@link RtUnitActor} proxy from a {@link Actor} stereotyped << RtUnit_Actor >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Actor
     * @return a {@link RtUnitActor} proxy or <i>null</i>.
     */
    @objid ("74ff83c4-5d4c-4b4e-8b00-6d777822a622")
    public static RtUnitActor instantiate(final Actor obj) {
        return RtUnitActor.canInstantiate(obj) ? new RtUnitActor(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtUnitActor} proxy from a {@link Actor} stereotyped << RtUnit_Actor >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Actor}
     * @return a {@link RtUnitActor} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e4765b56-e83f-44c9-92ff-5ddf413c1a8c")
    public static RtUnitActor safeInstantiate(final Actor obj) throws IllegalArgumentException {
        if (RtUnitActor.canInstantiate(obj))
        	return new RtUnitActor(obj);
        else
        	throw new IllegalArgumentException("RtUnitActor: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d278d11d-6d62-4e99-9367-eaf0414e2fc8")
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
        RtUnitActor other = (RtUnitActor) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Actor}. 
     * @return the Actor represented by this proxy, never null.
     */
    @objid ("d1aa2bf2-9b41-4c29-9a63-63e5f7a93a3f")
    public Actor getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtUnit_Actor_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d56dd5e-5311-4062-9905-bdb8c3686640")
    public String getRtUnit_Actor_main() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MAIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("df17af60-94c6-472f-b855-d8eba8ce1e98")
    public String getRtUnit_Actor_memorySize() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b991f9dc-8e85-4383-bab6-d50d1ebed731")
    public String getRtUnit_Actor_msgMaxSize() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MSGMAXSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8641c096-1983-4a47-927c-2430c0decb31")
    public String getRtUnit_Actor_operationalMode() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_OPERATIONALMODE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea6c9a64-2993-4d37-8faf-db5ae86c5d6e")
    public String getRtUnit_Actor_queueSchedPolicy() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_QUEUESCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6fa01331-afb9-4e25-8439-219f702a9aed")
    public String getRtUnit_Actor_queueSize() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_QUEUESIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("620e4c4d-4129-4031-812b-ef9f739eee4e")
    public String getRtUnit_Actor_srPoolPolicy() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7b4f32b7-b76c-4776-a280-f6dc07ffce4c")
    public String getRtUnit_Actor_srPoolSize() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("568a9b43-552a-4bcb-91a5-207647754173")
    public String getRtUnit_Actor_srPoolWaitingTime() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLWAITINGTIME_TAGTYPE_ELT);
    }

    @objid ("a23cddbf-fb21-4c43-87bd-8c7e223e7f8a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtUnit_Actor_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2a6a5b0-e4cb-4f2e-8df1-9c3771a23393")
    public boolean isRtUnit_Actor_isDynamic() {
        return this.elt.isTagged(RtUnitActor.MdaTypes.RTUNIT_ACTOR_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'RtUnit_Actor_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f49827ab-bda3-46f5-98de-448b64794669")
    public boolean isRtUnit_Actor_isMain() {
        return this.elt.isTagged(RtUnitActor.MdaTypes.RTUNIT_ACTOR_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Actor_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8a653563-2e1d-4714-9468-eb2641dc8a6e")
    public void setRtUnit_Actor_isDynamic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_ISDYNAMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitActor.MdaTypes.RTUNIT_ACTOR_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Actor_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e1a679d-cc3f-4444-8213-5a055bde6d59")
    public void setRtUnit_Actor_isMain(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_ISMAIN_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitActor.MdaTypes.RTUNIT_ACTOR_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtUnit_Actor_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81499479-d269-4bb7-9fc0-e85b87e3a0fd")
    public void setRtUnit_Actor_main(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MAIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("af80c9fc-cd7b-4386-9877-3b597eaa5cd4")
    public void setRtUnit_Actor_memorySize(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9bce73fa-9111-4afe-a59c-bd23f6e9dbb0")
    public void setRtUnit_Actor_msgMaxSize(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MSGMAXSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("15f635f9-14d3-4846-a53c-f6134db94223")
    public void setRtUnit_Actor_operationalMode(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_OPERATIONALMODE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e14ca8ec-4cf6-4ba0-b812-dd1b71ee016c")
    public void setRtUnit_Actor_queueSchedPolicy(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_QUEUESCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f8808d6e-141f-41be-9dde-84ac7fb51eda")
    public void setRtUnit_Actor_queueSize(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_QUEUESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c4f644d3-9fee-4d6e-8bd2-9d0556ee47bb")
    public void setRtUnit_Actor_srPoolPolicy(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("33e44eca-d71d-4427-9ae1-b41dd366ad39")
    public void setRtUnit_Actor_srPoolSize(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8775e032-856a-4b07-9c1c-4e9cc9242456")
    public void setRtUnit_Actor_srPoolWaitingTime(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLWAITINGTIME_TAGTYPE_ELT, value);
    }

    @objid ("fc1b2772-d62d-48a9-87ae-791de27db13d")
    protected RtUnitActor(final Actor elt) {
        this.elt = elt;
    }

    @objid ("f1e85db7-0445-4cb5-ad04-63711981664b")
    public static final class MdaTypes {
        @objid ("a66c0a7e-a8f7-4ee0-8002-12d8b9b5d144")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("22788cd7-78e0-4cfc-8e80-869b627dbe3d")
        public static TagType RTUNIT_ACTOR_ISDYNAMIC_TAGTYPE_ELT;

        @objid ("5b22e5c0-487c-4bba-a2d6-bfdd942e8578")
        public static TagType RTUNIT_ACTOR_ISMAIN_TAGTYPE_ELT;

        @objid ("4c235cb4-8b2c-47b9-aba9-5b0032896e54")
        public static TagType RTUNIT_ACTOR_SRPOOLSIZE_TAGTYPE_ELT;

        @objid ("952313fd-9fa2-4b31-b9e6-fdafd512088e")
        public static TagType RTUNIT_ACTOR_SRPOOLPOLICY_TAGTYPE_ELT;

        @objid ("a03185f3-9dc9-4312-8ad9-352e957cd424")
        public static TagType RTUNIT_ACTOR_SRPOOLWAITINGTIME_TAGTYPE_ELT;

        @objid ("83e53a42-12b9-4cf7-a6b2-2a3f9e01d351")
        public static TagType RTUNIT_ACTOR_QUEUESCHEDPOLICY_TAGTYPE_ELT;

        @objid ("5827ffc0-5b4c-49db-a994-987daa9dcd7f")
        public static TagType RTUNIT_ACTOR_QUEUESIZE_TAGTYPE_ELT;

        @objid ("c6912f46-a295-48b2-a5c8-882b497f2913")
        public static TagType RTUNIT_ACTOR_MSGMAXSIZE_TAGTYPE_ELT;

        @objid ("3f6ba9d2-7a5a-4256-91f7-7a6eceadbf47")
        public static TagType RTUNIT_ACTOR_OPERATIONALMODE_TAGTYPE_ELT;

        @objid ("ebf1a73d-8277-4e7f-b231-e564a165edd9")
        public static TagType RTUNIT_ACTOR_MAIN_TAGTYPE_ELT;

        @objid ("27827518-1ed1-4d21-a127-e5d99e213f4a")
        public static TagType RTUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("3e067dda-8568-47f7-bf2a-2ea6f8ae0320")
        private static Stereotype MDAASSOCDEP;

        @objid ("4dd18167-d576-4667-9fcb-013af1ffb96b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a6971730-d212-4b37-9d81-da18189656e3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00c30c46-0ccf-11df-8525-001302895b2b");
            RTUNIT_ACTOR_ISDYNAMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c56e92-0ccf-11df-8525-001302895b2b");
            RTUNIT_ACTOR_ISMAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c56e94-0ccf-11df-8525-001302895b2b");
            RTUNIT_ACTOR_SRPOOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c56e96-0ccf-11df-8525-001302895b2b");
            RTUNIT_ACTOR_SRPOOLPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c56e98-0ccf-11df-8525-001302895b2b");
            RTUNIT_ACTOR_SRPOOLWAITINGTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c56e9a-0ccf-11df-8525-001302895b2b");
            RTUNIT_ACTOR_QUEUESCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d02f941-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_ACTOR_QUEUESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "358cbacd-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_ACTOR_MSGMAXSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4433b711-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_ACTOR_OPERATIONALMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c56e9c-0ccf-11df-8525-001302895b2b");
            RTUNIT_ACTOR_MAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c56e9e-0ccf-11df-8525-001302895b2b");
            RTUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c56ea0-0ccf-11df-8525-001302895b2b");
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
