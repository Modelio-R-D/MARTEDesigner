/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.infrastructure.modelelement;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaCommStepModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << SaCommStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaCommStepModelElement extends GaCommStepModelElement {
    public static final String STEREOTYPE_NAME = "SaCommStep_ModelElement";

    public static final String SACOMMSTEP_MODELELEMENT_DEADLINE_TAGTYPE = "SaCommStep_ModelElement_deadline";

    public static final String SACOMMSTEP_MODELELEMENT_SCHSLACK_TAGTYPE = "SaCommStep_ModelElement_schSlack";

    public static final String SACOMMSTEP_MODELELEMENT_SPARECAP_TAGTYPE = "SaCommStep_ModelElement_spareCap";

    /**
     * Tells whether a {@link SaCommStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << SaCommStep_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << SaCommStep_ModelElement >> then instantiate a {@link SaCommStepModelElement} proxy.
     * 
     * @return a {@link SaCommStepModelElement} proxy on the created {@link ModelElement}.
     */
    public static SaCommStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommStepModelElement.STEREOTYPE_NAME);
        return SaCommStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link SaCommStepModelElement} proxy from a {@link ModelElement} stereotyped << SaCommStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link SaCommStepModelElement} proxy or <i>null</i>.
     */
    public static SaCommStepModelElement instantiate(final ModelElement obj) {
        return SaCommStepModelElement.canInstantiate(obj) ? new SaCommStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommStepModelElement} proxy from a {@link ModelElement} stereotyped << SaCommStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link SaCommStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaCommStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (SaCommStepModelElement.canInstantiate(obj))
        	return new SaCommStepModelElement(obj);
        else
        	throw new IllegalArgumentException("SaCommStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaCommStepModelElement other = (SaCommStepModelElement) obj;
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
     * Getter for string property 'SaCommStep_ModelElement_deadline'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaCommStep_ModelElement_deadline() {
        return this.elt.getTagValue(SaCommStepModelElement.MdaTypes.SACOMMSTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaCommStep_ModelElement_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaCommStep_ModelElement_schSlack() {
        return this.elt.getTagValue(SaCommStepModelElement.MdaTypes.SACOMMSTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaCommStep_ModelElement_spareCap'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaCommStep_ModelElement_spareCap() {
        return this.elt.getTagValue(SaCommStepModelElement.MdaTypes.SACOMMSTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SaCommStep_ModelElement_deadline'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaCommStep_ModelElement_deadline(final String value) {
        this.elt.putTagValue(SaCommStepModelElement.MdaTypes.SACOMMSTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaCommStep_ModelElement_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaCommStep_ModelElement_schSlack(final String value) {
        this.elt.putTagValue(SaCommStepModelElement.MdaTypes.SACOMMSTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaCommStep_ModelElement_spareCap'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaCommStep_ModelElement_spareCap(final String value) {
        this.elt.putTagValue(SaCommStepModelElement.MdaTypes.SACOMMSTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT, value);
    }

    protected SaCommStepModelElement(final ModelElement elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SACOMMSTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT;

        public static TagType SACOMMSTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT;

        public static TagType SACOMMSTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0ce4e8fb-14ac-11df-9d54-0014222a9f79");
            SACOMMSTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0ce4e8fc-14ac-11df-9d54-0014222a9f79");
            SACOMMSTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0ce4e8fe-14ac-11df-9d54-0014222a9f79");
            SACOMMSTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0ce4e8fd-14ac-11df-9d54-0014222a9f79");
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
