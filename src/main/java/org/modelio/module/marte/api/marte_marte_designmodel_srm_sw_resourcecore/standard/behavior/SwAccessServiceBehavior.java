/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.behavior;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior.GrServiceBehavior;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Behavior} with << SwAccessService_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwAccessServiceBehavior extends GrServiceBehavior {
    public static final String STEREOTYPE_NAME = "SwAccessService_Behavior";

    public static final String SWACCESSSERVICE_BEHAVIOR_ACCESSEDELEMENT_TAGTYPE = "SwAccessService_Behavior_accessedElement";

    public static final String SWACCESSSERVICE_BEHAVIOR_ISMODIFIER_TAGTYPE = "SwAccessService_Behavior_isModifier";

    /**
     * Tells whether a {@link SwAccessServiceBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << SwAccessService_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << SwAccessService_Behavior >> then instantiate a {@link SwAccessServiceBehavior} proxy.
     * 
     * @return a {@link SwAccessServiceBehavior} proxy on the created {@link Behavior}.
     */
    public static SwAccessServiceBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceBehavior.STEREOTYPE_NAME);
        return SwAccessServiceBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceBehavior} proxy from a {@link Behavior} stereotyped << SwAccessService_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link SwAccessServiceBehavior} proxy or <i>null</i>.
     */
    public static SwAccessServiceBehavior instantiate(final Behavior obj) {
        return SwAccessServiceBehavior.canInstantiate(obj) ? new SwAccessServiceBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceBehavior} proxy from a {@link Behavior} stereotyped << SwAccessService_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link SwAccessServiceBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwAccessServiceBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (SwAccessServiceBehavior.canInstantiate(obj))
        	return new SwAccessServiceBehavior(obj);
        else
        	throw new IllegalArgumentException("SwAccessServiceBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwAccessServiceBehavior other = (SwAccessServiceBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @Override
    public Behavior getElement() {
        return (Behavior)super.getElement();
    }

    /**
     * Getter for string property 'SwAccessService_Behavior_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwAccessService_Behavior_accessedElement() {
        return this.elt.getTagValue(SwAccessServiceBehavior.MdaTypes.SWACCESSSERVICE_BEHAVIOR_ACCESSEDELEMENT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwAccessService_Behavior_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwAccessService_Behavior_isModifier() {
        return this.elt.isTagged(SwAccessServiceBehavior.MdaTypes.SWACCESSSERVICE_BEHAVIOR_ISMODIFIER_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SwAccessService_Behavior_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwAccessService_Behavior_accessedElement(final String value) {
        this.elt.putTagValue(SwAccessServiceBehavior.MdaTypes.SWACCESSSERVICE_BEHAVIOR_ACCESSEDELEMENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwAccessService_Behavior_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwAccessService_Behavior_isModifier(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwAccessServiceBehavior.MdaTypes.SWACCESSSERVICE_BEHAVIOR_ISMODIFIER_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwAccessServiceBehavior.MdaTypes.SWACCESSSERVICE_BEHAVIOR_ISMODIFIER_TAGTYPE_ELT);
    }

    protected SwAccessServiceBehavior(final Behavior elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWACCESSSERVICE_BEHAVIOR_ISMODIFIER_TAGTYPE_ELT;

        public static TagType SWACCESSSERVICE_BEHAVIOR_ACCESSEDELEMENT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a7eb00-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_BEHAVIOR_ISMODIFIER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb06-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_BEHAVIOR_ACCESSEDELEMENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb0c-0ccf-11df-8525-001302895b2b");
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
