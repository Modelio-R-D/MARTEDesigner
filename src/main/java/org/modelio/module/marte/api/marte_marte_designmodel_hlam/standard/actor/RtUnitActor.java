/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.actor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class RtUnitActor {
    public static final String STEREOTYPE_NAME = "RtUnit_Actor";

    public static final String RTUNIT_ACTOR_ISDYNAMIC_TAGTYPE = "RtUnit_Actor_isDynamic";

    public static final String RTUNIT_ACTOR_ISMAIN_TAGTYPE = "RtUnit_Actor_isMain";

    public static final String RTUNIT_ACTOR_MAIN_TAGTYPE = "RtUnit_Actor_main";

    public static final String RTUNIT_ACTOR_MEMORYSIZE_TAGTYPE = "RtUnit_Actor_memorySize";

    public static final String RTUNIT_ACTOR_MSGMAXSIZE_TAGTYPE = "RtUnit_Actor_msgMaxSize";

    public static final String RTUNIT_ACTOR_OPERATIONALMODE_TAGTYPE = "RtUnit_Actor_operationalMode";

    public static final String RTUNIT_ACTOR_QUEUESCHEDPOLICY_TAGTYPE = "RtUnit_Actor_queueSchedPolicy";

    public static final String RTUNIT_ACTOR_QUEUESIZE_TAGTYPE = "RtUnit_Actor_queueSize";

    public static final String RTUNIT_ACTOR_SRPOOLPOLICY_TAGTYPE = "RtUnit_Actor_srPoolPolicy";

    public static final String RTUNIT_ACTOR_SRPOOLSIZE_TAGTYPE = "RtUnit_Actor_srPoolSize";

    public static final String RTUNIT_ACTOR_SRPOOLWAITINGTIME_TAGTYPE = "RtUnit_Actor_srPoolWaitingTime";

    /**
     * The underlying {@link Actor} represented by this proxy, never null.
     */
    protected final Actor elt;

    /**
     * Tells whether a {@link RtUnitActor proxy} can be instantiated from a {@link MObject} checking it is a {@link Actor} stereotyped << RtUnit_Actor >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Actor) && ((Actor) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitActor.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Actor} stereotyped << RtUnit_Actor >> then instantiate a {@link RtUnitActor} proxy.
     * 
     * @return a {@link RtUnitActor} proxy on the created {@link Actor}.
     */
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
    public static RtUnitActor safeInstantiate(final Actor obj) throws IllegalArgumentException {
        if (RtUnitActor.canInstantiate(obj))
        	return new RtUnitActor(obj);
        else
        	throw new IllegalArgumentException("RtUnitActor: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    public Actor getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtUnit_Actor_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Actor_main() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MAIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Actor_memorySize() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Actor_msgMaxSize() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MSGMAXSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Actor_operationalMode() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_OPERATIONALMODE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Actor_queueSchedPolicy() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_QUEUESCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Actor_queueSize() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_QUEUESIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Actor_srPoolPolicy() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Actor_srPoolSize() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Actor_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Actor_srPoolWaitingTime() {
        return this.elt.getTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLWAITINGTIME_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtUnit_Actor_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtUnit_Actor_isDynamic() {
        return this.elt.isTagged(RtUnitActor.MdaTypes.RTUNIT_ACTOR_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'RtUnit_Actor_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtUnit_Actor_isMain() {
        return this.elt.isTagged(RtUnitActor.MdaTypes.RTUNIT_ACTOR_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Actor_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setRtUnit_Actor_main(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MAIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Actor_memorySize(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Actor_msgMaxSize(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_MSGMAXSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Actor_operationalMode(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_OPERATIONALMODE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Actor_queueSchedPolicy(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_QUEUESCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Actor_queueSize(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_QUEUESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Actor_srPoolPolicy(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Actor_srPoolSize(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Actor_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Actor_srPoolWaitingTime(final String value) {
        this.elt.putTagValue(RtUnitActor.MdaTypes.RTUNIT_ACTOR_SRPOOLWAITINGTIME_TAGTYPE_ELT, value);
    }

    protected RtUnitActor(final Actor elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RTUNIT_ACTOR_ISDYNAMIC_TAGTYPE_ELT;

        public static TagType RTUNIT_ACTOR_ISMAIN_TAGTYPE_ELT;

        public static TagType RTUNIT_ACTOR_SRPOOLSIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_ACTOR_SRPOOLPOLICY_TAGTYPE_ELT;

        public static TagType RTUNIT_ACTOR_SRPOOLWAITINGTIME_TAGTYPE_ELT;

        public static TagType RTUNIT_ACTOR_QUEUESCHEDPOLICY_TAGTYPE_ELT;

        public static TagType RTUNIT_ACTOR_QUEUESIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_ACTOR_MSGMAXSIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_ACTOR_OPERATIONALMODE_TAGTYPE_ELT;

        public static TagType RTUNIT_ACTOR_MAIN_TAGTYPE_ELT;

        public static TagType RTUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
