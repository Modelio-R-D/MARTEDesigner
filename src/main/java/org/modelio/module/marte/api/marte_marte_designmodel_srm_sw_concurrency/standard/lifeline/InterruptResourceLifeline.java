/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
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
 * Proxy class to handle a {@link Lifeline} with << InterruptResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class InterruptResourceLifeline extends SwConcurrentResourceLifeline {
    public static final String STEREOTYPE_NAME = "InterruptResource_Lifeline";

    public static final String INTERRUPTRESOURCE_LIFELINE_ISMASKABLE_TAGTYPE = "InterruptResource_Lifeline_isMaskable";

    public static final String INTERRUPTRESOURCE_LIFELINE_KIND_TAGTYPE = "InterruptResource_Lifeline_kind";

    public static final String INTERRUPTRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE = "InterruptResource_Lifeline_maskElements";

    public static final String INTERRUPTRESOURCE_LIFELINE_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Lifeline_routineConnectServices";

    public static final String INTERRUPTRESOURCE_LIFELINE_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Lifeline_routineDisconnectServices";

    public static final String INTERRUPTRESOURCE_LIFELINE_VECTORELEMENTS_TAGTYPE = "InterruptResource_Lifeline_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << InterruptResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << InterruptResource_Lifeline >> then instantiate a {@link InterruptResourceLifeline} proxy.
     * 
     * @return a {@link InterruptResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static InterruptResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceLifeline.STEREOTYPE_NAME);
        return InterruptResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceLifeline} proxy from a {@link Lifeline} stereotyped << InterruptResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link InterruptResourceLifeline} proxy or <i>null</i>.
     */
    public static InterruptResourceLifeline instantiate(final Lifeline obj) {
        return InterruptResourceLifeline.canInstantiate(obj) ? new InterruptResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterruptResourceLifeline} proxy from a {@link Lifeline} stereotyped << InterruptResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link InterruptResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static InterruptResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (InterruptResourceLifeline.canInstantiate(obj))
        	return new InterruptResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        InterruptResourceLifeline other = (InterruptResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Lifeline_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getInterruptResource_Lifeline_kind() {
        return this.elt.getTagValue(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Lifeline_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Lifeline_maskElements() {
        return this.elt.getTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Lifeline_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Lifeline_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Lifeline_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Lifeline_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Lifeline_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Lifeline_vectorElements() {
        return this.elt.getTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Lifeline_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isInterruptResource_Lifeline_isMaskable() {
        return this.elt.isTagged(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Lifeline_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Lifeline_isMaskable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ISMASKABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'InterruptResource_Lifeline_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Lifeline_kind(final String value) {
        this.elt.putTagValue(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Lifeline_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Lifeline_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Lifeline_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Lifeline_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Lifeline_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Lifeline_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Lifeline_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Lifeline_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    protected InterruptResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_LIFELINE_KIND_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_LIFELINE_ISMASKABLE_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_LIFELINE_VECTORELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_LIFELINE_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_LIFELINE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cbbc68b4-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_LIFELINE_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbbc68b5-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_LIFELINE_ISMASKABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbbc68b6-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_LIFELINE_VECTORELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbbc68b7-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbbc68b8-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_LIFELINE_ROUTINECONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbbc68b9-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_LIFELINE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbbc68ba-10d0-11df-81d9-0014222a9f79");
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
