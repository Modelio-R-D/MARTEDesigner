/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("3ab5a527-c22b-4c7e-b5a2-86afab7f7e73")
public class SwAccessServiceBehavior extends GrServiceBehavior {
    @objid ("b46d0277-e309-4b48-afb8-6fcc7ce888c4")
    public static final String STEREOTYPE_NAME = "SwAccessService_Behavior";

    @objid ("c8b6cfab-93a5-423c-9c1b-553035029b65")
    public static final String SWACCESSSERVICE_BEHAVIOR_ACCESSEDELEMENT_TAGTYPE = "SwAccessService_Behavior_accessedElement";

    @objid ("57d90b49-d21f-4c3e-a259-ed1009645f08")
    public static final String SWACCESSSERVICE_BEHAVIOR_ISMODIFIER_TAGTYPE = "SwAccessService_Behavior_isModifier";

    /**
     * Tells whether a {@link SwAccessServiceBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << SwAccessService_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c1af8265-302d-450f-8974-642fb6f412ce")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << SwAccessService_Behavior >> then instantiate a {@link SwAccessServiceBehavior} proxy.
     * 
     * @return a {@link SwAccessServiceBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("5e2a560f-71b4-4431-879c-2f2aa628ee80")
    public static SwAccessServiceBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceBehavior.STEREOTYPE_NAME);
        return SwAccessServiceBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceBehavior} proxy from a {@link Behavior} stereotyped << SwAccessService_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link SwAccessServiceBehavior} proxy or <i>null</i>.
     */
    @objid ("94ad80c3-b5c3-4e76-8b46-4116eb7c9927")
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
    @objid ("bc0f0ffa-d26a-48c1-80fa-4e84b01e84d9")
    public static SwAccessServiceBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (SwAccessServiceBehavior.canInstantiate(obj))
        	return new SwAccessServiceBehavior(obj);
        else
        	throw new IllegalArgumentException("SwAccessServiceBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("22d4111f-3c1b-4c0b-942c-b73e859e8684")
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
    @objid ("e9c9f80e-acf5-48d3-b66f-8a7c59057b06")
    @Override
    public Behavior getElement() {
        return (Behavior)super.getElement();
    }

    /**
     * Getter for string property 'SwAccessService_Behavior_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0409d8a5-6ead-464e-865d-15364c44bdce")
    public String getSwAccessService_Behavior_accessedElement() {
        return this.elt.getTagValue(SwAccessServiceBehavior.MdaTypes.SWACCESSSERVICE_BEHAVIOR_ACCESSEDELEMENT_TAGTYPE_ELT);
    }

    @objid ("b2b3420d-9f87-4f87-a3b5-fbef105539fb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwAccessService_Behavior_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1ac2bd3-4bb5-49e1-85df-93d813ec022d")
    public boolean isSwAccessService_Behavior_isModifier() {
        return this.elt.isTagged(SwAccessServiceBehavior.MdaTypes.SWACCESSSERVICE_BEHAVIOR_ISMODIFIER_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SwAccessService_Behavior_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("833a1903-d582-417c-a8c8-2c0f86a7e865")
    public void setSwAccessService_Behavior_accessedElement(final String value) {
        this.elt.putTagValue(SwAccessServiceBehavior.MdaTypes.SWACCESSSERVICE_BEHAVIOR_ACCESSEDELEMENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwAccessService_Behavior_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("26c74fda-1d15-4345-a617-35204607987c")
    public void setSwAccessService_Behavior_isModifier(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwAccessServiceBehavior.MdaTypes.SWACCESSSERVICE_BEHAVIOR_ISMODIFIER_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwAccessServiceBehavior.MdaTypes.SWACCESSSERVICE_BEHAVIOR_ISMODIFIER_TAGTYPE_ELT);
    }

    @objid ("534fb2c4-9a02-4130-9919-c3d02add259c")
    protected SwAccessServiceBehavior(final Behavior elt) {
        super(elt);
    }

    @objid ("ab046937-fc12-4e20-8f2e-e2f0aacd61b6")
    public static final class MdaTypes {
        @objid ("7d547184-36fe-454e-ab0b-3975eb1e51fd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7840f1cc-fa4d-4ed6-b070-9fdf07110a8b")
        public static TagType SWACCESSSERVICE_BEHAVIOR_ISMODIFIER_TAGTYPE_ELT;

        @objid ("3d3137a1-ccac-49bd-8a6a-43b346f3d462")
        public static TagType SWACCESSSERVICE_BEHAVIOR_ACCESSEDELEMENT_TAGTYPE_ELT;

        @objid ("d2ac5186-0b52-4e94-bb39-ee53105bfb37")
        private static Stereotype MDAASSOCDEP;

        @objid ("d4944de2-f636-427d-b402-c17d673db01b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f4c78d88-ab2a-457d-9b38-dbaf5e176753")
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
