/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << RtUnit_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtUnitClass {
    public static final String STEREOTYPE_NAME = "RtUnit_Class";

    public static final String RTUNIT_CLASS_ISDYNAMIC_TAGTYPE = "RtUnit_Class_isDynamic";

    public static final String RTUNIT_CLASS_ISMAIN_TAGTYPE = "RtUnit_Class_isMain";

    public static final String RTUNIT_CLASS_MAIN_TAGTYPE = "RtUnit_Class_main";

    public static final String RTUNIT_CLASS_MEMORYSIZE_TAGTYPE = "RtUnit_Class_memorySize";

    public static final String RTUNIT_CLASS_MSGMAXSIZE_TAGTYPE = "RtUnit_Class_msgMaxSize";

    public static final String RTUNIT_CLASS_OPERATIONALMODE_TAGTYPE = "RtUnit_Class_operationalMode";

    public static final String RTUNIT_CLASS_QUEUESCHEDPOLICY_TAGTYPE = "RtUnit_Class_queueSchedPolicy";

    public static final String RTUNIT_CLASS_QUEUESIZE_TAGTYPE = "RtUnit_Class_queueSize";

    public static final String RTUNIT_CLASS_SRPOOLPOLICY_TAGTYPE = "RtUnit_Class_srPoolPolicy";

    public static final String RTUNIT_CLASS_SRPOOLSIZE_TAGTYPE = "RtUnit_Class_srPoolSize";

    public static final String RTUNIT_CLASS_SRPOOLWAITINGTIME_TAGTYPE = "RtUnit_Class_srPoolWaitingTime";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    protected final Class elt;

    /**
     * Tells whether a {@link RtUnitClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RtUnit_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RtUnit_Class >> then instantiate a {@link RtUnitClass} proxy.
     * 
     * @return a {@link RtUnitClass} proxy on the created {@link Class}.
     */
    public static RtUnitClass create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitClass.STEREOTYPE_NAME);
        return RtUnitClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RtUnitClass} proxy from a {@link Class} stereotyped << RtUnit_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RtUnitClass} proxy or <i>null</i>.
     */
    public static RtUnitClass instantiate(final Class obj) {
        return RtUnitClass.canInstantiate(obj) ? new RtUnitClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtUnitClass} proxy from a {@link Class} stereotyped << RtUnit_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RtUnitClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtUnitClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RtUnitClass.canInstantiate(obj))
        	return new RtUnitClass(obj);
        else
        	throw new IllegalArgumentException("RtUnitClass: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtUnitClass other = (RtUnitClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtUnit_Class_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Class_main() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_MAIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Class_memorySize() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Class_msgMaxSize() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_MSGMAXSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Class_operationalMode() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_OPERATIONALMODE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Class_queueSchedPolicy() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_QUEUESCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Class_queueSize() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_QUEUESIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Class_srPoolPolicy() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_SRPOOLPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Class_srPoolSize() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_SRPOOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Class_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Class_srPoolWaitingTime() {
        return this.elt.getTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_SRPOOLWAITINGTIME_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtUnit_Class_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtUnit_Class_isDynamic() {
        return this.elt.isTagged(RtUnitClass.MdaTypes.RTUNIT_CLASS_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'RtUnit_Class_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtUnit_Class_isMain() {
        return this.elt.isTagged(RtUnitClass.MdaTypes.RTUNIT_CLASS_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Class_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Class_isDynamic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_ISDYNAMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitClass.MdaTypes.RTUNIT_CLASS_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Class_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Class_isMain(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_ISMAIN_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitClass.MdaTypes.RTUNIT_CLASS_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtUnit_Class_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Class_main(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_MAIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Class_memorySize(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Class_msgMaxSize(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_MSGMAXSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Class_operationalMode(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_OPERATIONALMODE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Class_queueSchedPolicy(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_QUEUESCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Class_queueSize(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_QUEUESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Class_srPoolPolicy(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_SRPOOLPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Class_srPoolSize(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_SRPOOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Class_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Class_srPoolWaitingTime(final String value) {
        this.elt.putTagValue(RtUnitClass.MdaTypes.RTUNIT_CLASS_SRPOOLWAITINGTIME_TAGTYPE_ELT, value);
    }

    protected RtUnitClass(final Class elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RTUNIT_CLASS_ISDYNAMIC_TAGTYPE_ELT;

        public static TagType RTUNIT_CLASS_ISMAIN_TAGTYPE_ELT;

        public static TagType RTUNIT_CLASS_SRPOOLSIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_CLASS_SRPOOLPOLICY_TAGTYPE_ELT;

        public static TagType RTUNIT_CLASS_SRPOOLWAITINGTIME_TAGTYPE_ELT;

        public static TagType RTUNIT_CLASS_QUEUESCHEDPOLICY_TAGTYPE_ELT;

        public static TagType RTUNIT_CLASS_QUEUESIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_CLASS_MSGMAXSIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_CLASS_OPERATIONALMODE_TAGTYPE_ELT;

        public static TagType RTUNIT_CLASS_MAIN_TAGTYPE_ELT;

        public static TagType RTUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4cd42cdf-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_ISDYNAMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce0-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_ISMAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce1-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_SRPOOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce2-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_SRPOOLPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce3-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_SRPOOLWAITINGTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce4-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_QUEUESCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c08435f-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_CLASS_QUEUESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c08435d-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_CLASS_MSGMAXSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c08435e-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_CLASS_OPERATIONALMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce5-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_MAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce6-0ce9-11df-b742-001302895b2b");
            RTUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4cd42ce7-0ce9-11df-b742-001302895b2b");
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
