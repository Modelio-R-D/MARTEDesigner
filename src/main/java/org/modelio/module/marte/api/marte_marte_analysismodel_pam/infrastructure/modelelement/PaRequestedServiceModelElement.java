/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaRequestedServiceModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << PaRequestedService_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class PaRequestedServiceModelElement extends GaRequestedServiceModelElement {
    public static final String STEREOTYPE_NAME = "PaRequestedService_ModelElement";

    public static final String PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT_TAGTYPE = "PaRequestedService_ModelElement_behavCount";

    public static final String PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND_TAGTYPE = "PaRequestedService_ModelElement_behavDemand";

    public static final String PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT_TAGTYPE = "PaRequestedService_ModelElement_extOpCount";

    public static final String PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND_TAGTYPE = "PaRequestedService_ModelElement_extOpDemand";

    public static final String PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE = "PaRequestedService_ModelElement_noSync";

    /**
     * Tells whether a {@link PaRequestedServiceModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PaRequestedService_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaRequestedServiceModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PaRequestedService_ModelElement >> then instantiate a {@link PaRequestedServiceModelElement} proxy.
     * 
     * @return a {@link PaRequestedServiceModelElement} proxy on the created {@link ModelElement}.
     */
    public static PaRequestedServiceModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaRequestedServiceModelElement.STEREOTYPE_NAME);
        return PaRequestedServiceModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PaRequestedServiceModelElement} proxy from a {@link ModelElement} stereotyped << PaRequestedService_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PaRequestedServiceModelElement} proxy or <i>null</i>.
     */
    public static PaRequestedServiceModelElement instantiate(final ModelElement obj) {
        return PaRequestedServiceModelElement.canInstantiate(obj) ? new PaRequestedServiceModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaRequestedServiceModelElement} proxy from a {@link ModelElement} stereotyped << PaRequestedService_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PaRequestedServiceModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static PaRequestedServiceModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PaRequestedServiceModelElement.canInstantiate(obj))
        	return new PaRequestedServiceModelElement(obj);
        else
        	throw new IllegalArgumentException("PaRequestedServiceModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        PaRequestedServiceModelElement other = (PaRequestedServiceModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for List<String> property 'PaRequestedService_ModelElement_behavCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getPaRequestedService_ModelElement_behavCount() {
        return this.elt.getTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaRequestedService_ModelElement_behavDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getPaRequestedService_ModelElement_behavDemand() {
        return this.elt.getTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaRequestedService_ModelElement_extOpCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getPaRequestedService_ModelElement_extOpCount() {
        return this.elt.getTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaRequestedService_ModelElement_extOpDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getPaRequestedService_ModelElement_extOpDemand() {
        return this.elt.getTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'PaRequestedService_ModelElement_noSync'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isPaRequestedService_ModelElement_noSync() {
        return this.elt.isTagged(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'PaRequestedService_ModelElement_behavCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaRequestedService_ModelElement_behavCount(final List<String> values) {
        this.elt.putTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaRequestedService_ModelElement_behavDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaRequestedService_ModelElement_behavDemand(final List<String> values) {
        this.elt.putTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaRequestedService_ModelElement_extOpCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaRequestedService_ModelElement_extOpCount(final List<String> values) {
        this.elt.putTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaRequestedService_ModelElement_extOpDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaRequestedService_ModelElement_extOpDemand(final List<String> values) {
        this.elt.putTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'PaRequestedService_ModelElement_noSync'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaRequestedService_ModelElement_noSync(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE_ELT);
    }

    protected PaRequestedServiceModelElement(final ModelElement elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE_ELT;

        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT;

        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT;

        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT;

        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7ba54cc4-14b1-11df-9d54-0014222a9f79");
            PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e0f6d4dc-16ef-11df-b92a-0014222a9f79");
            PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e0f6d4dd-16ef-11df-b92a-0014222a9f79");
            PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e0f6d4de-16ef-11df-b92a-0014222a9f79");
            PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e0f6d4df-16ef-11df-b92a-0014222a9f79");
            PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e0f6d4e0-16ef-11df-b92a-0014222a9f79");
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
