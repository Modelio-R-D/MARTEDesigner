/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("08ef45a2-173b-42ed-8e75-bc555d923634")
    public static final String STEREOTYPE_NAME = "RtUnit_Actor";

    @objid ("000d8a24-5387-4cc6-92c1-e2f714ed51f4")
    public static final String RTUNIT_ACTOR_ISDYNAMIC_TAGTYPE = "RtUnit_Actor_isDynamic";

    @objid ("0ac4a383-1221-4148-82a0-2dc493efefab")
    public static final String RTUNIT_ACTOR_ISMAIN_TAGTYPE = "RtUnit_Actor_isMain";

    @objid ("cadbb5f7-5122-4d95-a500-d622bca36021")
    public static final String RTUNIT_ACTOR_MAIN_TAGTYPE = "RtUnit_Actor_main";

    @objid ("4bd47a07-3d7e-4698-8f5b-ff08e97692bb")
    public static final String RTUNIT_ACTOR_MEMORYSIZE_TAGTYPE = "RtUnit_Actor_memorySize";

    @objid ("096a190b-1087-4c63-8eb5-04842ca8c804")
    public static final String RTUNIT_ACTOR_MSGMAXSIZE_TAGTYPE = "RtUnit_Actor_msgMaxSize";

    @objid ("17ccb3f9-ef78-4f08-86de-c5a00bd8c176")
    public static final String RTUNIT_ACTOR_OPERATIONALMODE_TAGTYPE = "RtUnit_Actor_operationalMode";

    @objid ("b795798d-74c0-447e-a717-fcb4ef09b7d3")
    public static final String RTUNIT_ACTOR_QUEUESCHEDPOLICY_TAGTYPE = "RtUnit_Actor_queueSchedPolicy";

    @objid ("5ece4345-ca03-4b64-84e7-5faa41bb99b1")
    public static final String RTUNIT_ACTOR_QUEUESIZE_TAGTYPE = "RtUnit_Actor_queueSize";

    @objid ("35e55a71-84a7-42e9-b327-3f4c474d1ff6")
    public static final String RTUNIT_ACTOR_SRPOOLPOLICY_TAGTYPE = "RtUnit_Actor_srPoolPolicy";

    @objid ("b77c62b1-90f5-4a6a-8f07-a9d2c31fd31f")
    public static final String RTUNIT_ACTOR_SRPOOLSIZE_TAGTYPE = "RtUnit_Actor_srPoolSize";

    @objid ("319d5ff1-424c-44fb-b4e4-7149141b0117")
    public static final String RTUNIT_ACTOR_SRPOOLWAITINGTIME_TAGTYPE = "RtUnit_Actor_srPoolWaitingTime";

    /**
     * The underlying {@link Actor} represented by this proxy, never null.
     */
    @objid ("2edb9948-e3eb-4450-b3da-b4e58fada44a")
    protected final Actor elt;

    /**
     * Tells whether a {@link RtUnitActor proxy} can be instantiated from a {@link MObject} checking it is a {@link Actor} stereotyped << RtUnit_Actor >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d3aac143-b0b0-40a1-9f35-cf531a8f6d31")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Actor) && ((Actor) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitActor.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Actor} stereotyped << RtUnit_Actor >> then instantiate a {@link RtUnitActor} proxy.
     * 
     * @return a {@link RtUnitActor} proxy on the created {@link Actor}.
     */
    @objid ("cc394d13-88e6-45f7-a33f-477b79e9700f")
    public static RtUnitActor create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Actor");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitActor.STEREOTYPE_NAME);
        return RtUnitActor.instantiate((Actor)e);
    }

    /**
     * Tries to instantiate a {@link RtUnitActor} proxy from a {@link Actor} stereotyped << RtUnit_Actor >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Actor
     * @return a {@link RtUnitActor} proxy or <i>null</i>.
     */
    @objid ("386fa844-78f6-4c8d-a4de-f34455365ea4")
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
    @objid ("e0ce9f51-3401-43fa-b834-4461890184c3")
    public static RtUnitActor safeInstantiate(final Actor obj) throws IllegalArgumentException {
        if (RtUnitActor.canInstantiate(obj))
        	return new RtUnitActor(obj);
        else
        	throw new IllegalArgumentException("RtUnitActor: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("028dac27-836a-4edc-aabe-4ef4a8e02333")
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
    @objid ("d46279e7-6c4d-458f-859c-fd4840bd9eea")
    public Actor getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtUnit_Actor_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0cac35ee-4cec-40a1-b5d9-7b3b77771122")
    public String getRtUnit_Actor_main() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MAIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("824d586b-50dc-4975-b581-c0be52d2f889")
    public String getRtUnit_Actor_memorySize() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("19ef049a-0a89-4959-aeaf-3d52da75dc87")
    public String getRtUnit_Actor_msgMaxSize() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MSGMAXSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0d7f42d-8c5b-42be-bd88-ff6306ab86ea")
    public String getRtUnit_Actor_operationalMode() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_OPERATIONALMODE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("278d5be1-7d9c-4f9d-a3a6-398114fc468c")
    public String getRtUnit_Actor_queueSchedPolicy() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_QUEUESCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67bed4bd-701e-4f09-a391-8e0298077e55")
    public String getRtUnit_Actor_queueSize() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_QUEUESIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3cbaa4ae-2c36-48e6-bbe7-4ecd8e7d1e97")
    public String getRtUnit_Actor_srPoolPolicy() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("efeaef01-8eaa-481d-bd6e-8d2c82829993")
    public String getRtUnit_Actor_srPoolSize() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1d08046e-7385-4792-8cc1-bc42c6b1e66e")
    public String getRtUnit_Actor_srPoolWaitingTime() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLWAITINGTIME_TAGTYPE_ELT);
    }

    @objid ("74b7e43d-99ab-4867-8b46-9c5e77b47027")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtUnit_Actor_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ca81261-55b2-4056-aed6-ac7fe9aa583d")
    public boolean isRtUnit_Actor_isDynamic() {
        return this.elt.isTagged(RtUnitActor.MdaTypes.RTUNIT_ACTOR_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'RtUnit_Actor_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2b107dc-22b4-41ac-95e2-0294f6435f88")
    public boolean isRtUnit_Actor_isMain() {
        return this.elt.isTagged(RtUnitActor.MdaTypes.RTUNIT_ACTOR_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Actor_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9185548f-e671-4446-917b-60079d95b6c5")
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
    @objid ("af3c393c-d991-44cd-9c7d-50c7e3147a3b")
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
    @objid ("39215d58-465a-4f0a-be56-3e659925ec1c")
    public void setRtUnit_Actor_main(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MAIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52290328-bcca-48c4-9a93-f319f32d1869")
    public void setRtUnit_Actor_memorySize(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42983ff1-ab48-49e0-9874-7faf8848bb2a")
    public void setRtUnit_Actor_msgMaxSize(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MSGMAXSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("18808811-28a5-4027-90da-eb93d0dcd89b")
    public void setRtUnit_Actor_operationalMode(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_OPERATIONALMODE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("039c9d8e-d0f6-42ff-900d-53317e9a03ba")
    public void setRtUnit_Actor_queueSchedPolicy(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_QUEUESCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0edf4225-b1b8-4460-96df-eb2485ea3494")
    public void setRtUnit_Actor_queueSize(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_QUEUESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0835a6d5-7fdb-4e24-88fe-63ac3e1d1ca1")
    public void setRtUnit_Actor_srPoolPolicy(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1df8f019-90f8-4fc6-99b2-3c8b6afe1671")
    public void setRtUnit_Actor_srPoolSize(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6553e5c6-d068-4bf1-b77d-06e3c45a0298")
    public void setRtUnit_Actor_srPoolWaitingTime(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLWAITINGTIME_TAGTYPE_ELT, value);
    }

    @objid ("0768c9f7-f216-4ecf-85b5-8bb0e3352f14")
    protected RtUnitActor(final Actor elt) {
        this.elt = elt;
    }

    @objid ("f1e85db7-0445-4cb5-ad04-63711981664b")
    public static final class MdaTypes {
        @objid ("6a2fca68-c4dd-4ff0-b73b-5956c4971ea7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3f0116ed-e809-4577-9284-9ea87e4f21ec")
        public static TagType RTUNIT_ACTOR_ISDYNAMIC_TAGTYPE_ELT;

        @objid ("f980723d-ab30-474e-91e4-c442fdcdcdc1")
        public static TagType RTUNIT_ACTOR_ISMAIN_TAGTYPE_ELT;

        @objid ("b63a1743-ecab-404d-9f93-b380bc3d5bc1")
        public static TagType RTUNIT_ACTOR_SRPOOLSIZE_TAGTYPE_ELT;

        @objid ("744a6eca-8cc4-472e-95a9-e505228d2f95")
        public static TagType RTUNIT_ACTOR_SRPOOLPOLICY_TAGTYPE_ELT;

        @objid ("f468f54b-23b9-455e-869d-eb5d29629caa")
        public static TagType RTUNIT_ACTOR_SRPOOLWAITINGTIME_TAGTYPE_ELT;

        @objid ("28df6802-6f79-46e4-8ee3-63a533d3afb2")
        public static TagType RTUNIT_ACTOR_QUEUESCHEDPOLICY_TAGTYPE_ELT;

        @objid ("c17c947b-0027-4bb8-9ee4-3b31c9fb1527")
        public static TagType RTUNIT_ACTOR_QUEUESIZE_TAGTYPE_ELT;

        @objid ("a14da9ea-84b9-4bc9-892e-adc6a38bffe7")
        public static TagType RTUNIT_ACTOR_MSGMAXSIZE_TAGTYPE_ELT;

        @objid ("01bd1f60-4984-4694-94b4-51eaa8ffd3fe")
        public static TagType RTUNIT_ACTOR_OPERATIONALMODE_TAGTYPE_ELT;

        @objid ("4e3acc59-d601-48e8-97d4-1726cb565c9b")
        public static TagType RTUNIT_ACTOR_MAIN_TAGTYPE_ELT;

        @objid ("73d7793c-3963-4648-b9cb-b88cf617d0c1")
        public static TagType RTUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("e0c8b764-b86b-4ef1-af74-4173710f9731")
        private static Stereotype MDAASSOCDEP;

        @objid ("4f3eeff0-ff00-47be-a1eb-b588603b1352")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("203fa384-0262-4464-8f24-3390719350a6")
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
