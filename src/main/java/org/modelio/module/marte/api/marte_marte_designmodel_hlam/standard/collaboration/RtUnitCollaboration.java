/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.collaboration;

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
public class RtUnitCollaboration {
    public static final String STEREOTYPE_NAME = "RtUnit_Collaboration";

    public static final String RTUNIT_COLLABORATION_ISDYNAMIC_TAGTYPE = "RtUnit_Collaboration_isDynamic";

    public static final String RTUNIT_COLLABORATION_ISMAIN_TAGTYPE = "RtUnit_Collaboration_isMain";

    public static final String RTUNIT_COLLABORATION_MAIN_TAGTYPE = "RtUnit_Collaboration_main";

    public static final String RTUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE = "RtUnit_Collaboration_memorySize";

    public static final String RTUNIT_COLLABORATION_MSGMAXSIZE_TAGTYPE = "RtUnit_Collaboration_msgMaxSize";

    public static final String RTUNIT_COLLABORATION_OPERATIONALMODE_TAGTYPE = "RtUnit_Collaboration_operationalMode";

    public static final String RTUNIT_COLLABORATION_QUEUESCHEDPOLICY_TAGTYPE = "RtUnit_Collaboration_queueSchedPolicy";

    public static final String RTUNIT_COLLABORATION_QUEUESIZE_TAGTYPE = "RtUnit_Collaboration_queueSize";

    public static final String RTUNIT_COLLABORATION_SRPOOLPOLICY_TAGTYPE = "RtUnit_Collaboration_srPoolPolicy";

    public static final String RTUNIT_COLLABORATION_SRPOOLSIZE_TAGTYPE = "RtUnit_Collaboration_srPoolSize";

    public static final String RTUNIT_COLLABORATION_SRPOOLWAITINGTIME_TAGTYPE = "RtUnit_Collaboration_srPoolWaitingTime";

    /**
     * The underlying {@link Collaboration} represented by this proxy, never null.
     */
    protected final Collaboration elt;

    /**
     * Tells whether a {@link RtUnitCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << RtUnit_Collaboration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << RtUnit_Collaboration >> then instantiate a {@link RtUnitCollaboration} proxy.
     * 
     * @return a {@link RtUnitCollaboration} proxy on the created {@link Collaboration}.
     */
    public static RtUnitCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitCollaboration.STEREOTYPE_NAME);
        return RtUnitCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link RtUnitCollaboration} proxy from a {@link Collaboration} stereotyped << RtUnit_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link RtUnitCollaboration} proxy or <i>null</i>.
     */
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
    public static RtUnitCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (RtUnitCollaboration.canInstantiate(obj))
        	return new RtUnitCollaboration(obj);
        else
        	throw new IllegalArgumentException("RtUnitCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtUnitCollaboration other = (RtUnitCollaboration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    public Collaboration getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Collaboration_main() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_MAIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Collaboration_memorySize() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Collaboration_msgMaxSize() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_MSGMAXSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Collaboration_operationalMode() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_OPERATIONALMODE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Collaboration_queueSchedPolicy() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_QUEUESCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Collaboration_queueSize() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_QUEUESIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Collaboration_srPoolPolicy() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_SRPOOLPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Collaboration_srPoolSize() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_SRPOOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Collaboration_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_Collaboration_srPoolWaitingTime() {
        return this.elt.getTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_SRPOOLWAITINGTIME_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtUnit_Collaboration_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtUnit_Collaboration_isDynamic() {
        return this.elt.isTagged(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'RtUnit_Collaboration_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtUnit_Collaboration_isMain() {
        return this.elt.isTagged(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Collaboration_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setRtUnit_Collaboration_main(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_MAIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Collaboration_memorySize(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Collaboration_msgMaxSize(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_MSGMAXSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Collaboration_operationalMode(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_OPERATIONALMODE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Collaboration_queueSchedPolicy(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_QUEUESCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Collaboration_queueSize(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_QUEUESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Collaboration_srPoolPolicy(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_SRPOOLPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Collaboration_srPoolSize(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_SRPOOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Collaboration_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_Collaboration_srPoolWaitingTime(final String value) {
        this.elt.putTagValue(RtUnitCollaboration.MdaTypes.RTUNIT_COLLABORATION_SRPOOLWAITINGTIME_TAGTYPE_ELT, value);
    }

    protected RtUnitCollaboration(final Collaboration elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RTUNIT_COLLABORATION_ISDYNAMIC_TAGTYPE_ELT;

        public static TagType RTUNIT_COLLABORATION_ISMAIN_TAGTYPE_ELT;

        public static TagType RTUNIT_COLLABORATION_SRPOOLSIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_COLLABORATION_SRPOOLPOLICY_TAGTYPE_ELT;

        public static TagType RTUNIT_COLLABORATION_SRPOOLWAITINGTIME_TAGTYPE_ELT;

        public static TagType RTUNIT_COLLABORATION_QUEUESCHEDPOLICY_TAGTYPE_ELT;

        public static TagType RTUNIT_COLLABORATION_QUEUESIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_COLLABORATION_MSGMAXSIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_COLLABORATION_OPERATIONALMODE_TAGTYPE_ELT;

        public static TagType RTUNIT_COLLABORATION_MAIN_TAGTYPE_ELT;

        public static TagType RTUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
