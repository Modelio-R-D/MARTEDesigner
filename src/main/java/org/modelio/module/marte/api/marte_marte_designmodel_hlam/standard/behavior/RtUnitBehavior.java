/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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
 * Proxy class to handle a {@link Behavior} with << RtUnit_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtUnitBehavior {
    public static final String STEREOTYPE_NAME = "RtUnit_Behavior";

    public static final String RTUNIT_BEHAVIOR_ISDYNAMIC_TAGTYPE = "RtUnit_Behavior_isDynamic";

    public static final String RTUNIT_BEHAVIOR_ISMAIN_TAGTYPE = "RtUnit_Behavior_isMain";

    public static final String RTUNIT_BEHAVIOR_MAIN_TAGTYPE = "RtUnit_Behavior_main";

    public static final String RTUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE = "RtUnit_Behavior_memorySize";

    public static final String RTUNIT_BEHAVIOR_MSGMAXSIZE_TAGTYPE = "RtUnit_Behavior_msgMaxSize";

    public static final String RTUNIT_BEHAVIOR_OPERATIONALMODE_TAGTYPE = "RtUnit_Behavior_operationalMode";

    public static final String RTUNIT_BEHAVIOR_QUEUESCHEDPOLICY_TAGTYPE = "RtUnit_Behavior_queueSchedPolicy";

    public static final String RTUNIT_BEHAVIOR_QUEUESIZE_TAGTYPE = "RtUnit_Behavior_queueSize";

    public static final String RTUNIT_BEHAVIOR_SRPOOLPOLICY_TAGTYPE = "RtUnit_Behavior_srPoolPolicy";

    public static final String RTUNIT_BEHAVIOR_SRPOOLSIZE_TAGTYPE = "RtUnit_Behavior_srPoolSize";

    public static final String RTUNIT_BEHAVIOR_SRPOOLWAITINGTIME_TAGTYPE = "RtUnit_Behavior_srPoolWaitingTime";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    protected final Behavior elt;

    /**
     * Tells whether a {@link RtUnitBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << RtUnit_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << RtUnit_Behavior >> then instantiate a {@link RtUnitBehavior} proxy.
     * 
     * @return a {@link RtUnitBehavior} proxy on the created {@link Behavior}.
     */
    public static RtUnitBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitBehavior.STEREOTYPE_NAME);
        return RtUnitBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link RtUnitBehavior} proxy from a {@link Behavior} stereotyped << RtUnit_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link RtUnitBehavior} proxy or <i>null</i>.
     */
    public static RtUnitBehavior instantiate(final Behavior obj) {
        return RtUnitBehavior.canInstantiate(obj) ? new RtUnitBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtUnitBehavior} proxy from a {@link Behavior} stereotyped << RtUnit_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link RtUnitBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtUnitBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (RtUnitBehavior.canInstantiate(obj))
        	return new RtUnitBehavior(obj);
        else
        	throw new IllegalArgumentException("RtUnitBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtUnitBehavior other = (RtUnitBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    public Behavior getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtUnit_Behavior_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Behavior_main() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_MAIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Behavior_memorySize() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Behavior_msgMaxSize() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_MSGMAXSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Behavior_operationalMode() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_OPERATIONALMODE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Behavior_queueSchedPolicy() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_QUEUESCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Behavior_queueSize() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_QUEUESIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Behavior_srPoolPolicy() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_SRPOOLPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Behavior_srPoolSize() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_SRPOOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Behavior_srPoolWaitingTime() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_SRPOOLWAITINGTIME_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtUnit_Behavior_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtUnit_Behavior_isDynamic() {
        return this.elt.isTagged(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'RtUnit_Behavior_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtUnit_Behavior_isMain() {
        return this.elt.isTagged(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Behavior_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Behavior_isDynamic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_ISDYNAMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Behavior_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Behavior_isMain(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_ISMAIN_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Behavior_main(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_MAIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Behavior_memorySize(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Behavior_msgMaxSize(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_MSGMAXSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Behavior_operationalMode(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_OPERATIONALMODE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Behavior_queueSchedPolicy(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_QUEUESCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Behavior_queueSize(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_QUEUESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Behavior_srPoolPolicy(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_SRPOOLPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Behavior_srPoolSize(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_SRPOOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Behavior_srPoolWaitingTime(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_SRPOOLWAITINGTIME_TAGTYPE_ELT, value);
    }

    protected RtUnitBehavior(final Behavior elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RTUNIT_BEHAVIOR_ISDYNAMIC_TAGTYPE_ELT;

        public static TagType RTUNIT_BEHAVIOR_ISMAIN_TAGTYPE_ELT;

        public static TagType RTUNIT_BEHAVIOR_SRPOOLSIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_BEHAVIOR_SRPOOLPOLICY_TAGTYPE_ELT;

        public static TagType RTUNIT_BEHAVIOR_SRPOOLWAITINGTIME_TAGTYPE_ELT;

        public static TagType RTUNIT_BEHAVIOR_QUEUESCHEDPOLICY_TAGTYPE_ELT;

        public static TagType RTUNIT_BEHAVIOR_QUEUESIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_BEHAVIOR_MSGMAXSIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_BEHAVIOR_OPERATIONALMODE_TAGTYPE_ELT;

        public static TagType RTUNIT_BEHAVIOR_MAIN_TAGTYPE_ELT;

        public static TagType RTUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "97dd8e9f-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_ISDYNAMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c2b-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_ISMAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c2c-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_SRPOOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c2d-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_SRPOOLPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c32-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_SRPOOLWAITINGTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c33-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_QUEUESCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a2e471d-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_BEHAVIOR_QUEUESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a2e471b-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_BEHAVIOR_MSGMAXSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a2e471c-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_BEHAVIOR_OPERATIONALMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c34-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_MAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c35-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c2e-0cea-11df-b742-001302895b2b");
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
