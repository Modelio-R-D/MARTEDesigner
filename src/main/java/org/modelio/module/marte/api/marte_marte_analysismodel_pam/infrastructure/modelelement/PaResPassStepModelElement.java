/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaStepModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << PaResPassStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9b050f1f-3cdc-4705-9db6-46ac69ae8afe")
public class PaResPassStepModelElement extends GaStepModelElement {
    @objid ("79e87bdd-e400-415b-8a26-9a64299c64d8")
    public static final String STEREOTYPE_NAME = "PaResPassStep_ModelElement";

    @objid ("00517846-eb34-4b4f-966a-047984e5045e")
    public static final String PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE = "PaResPassStep_ModelElement_resUnits";

    @objid ("11ae853b-8736-4f16-aebf-6588ffcf1cfd")
    public static final String PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE = "PaResPassStep_ModelElement_resource";

    /**
     * Tells whether a {@link PaResPassStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PaResPassStep_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c511204f-1da8-40d9-9b4d-77dc37b50d6f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaResPassStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PaResPassStep_ModelElement >> then instantiate a {@link PaResPassStepModelElement} proxy.
     * 
     * @return a {@link PaResPassStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("e3f79c45-c9be-4da6-a42f-b652988247f9")
    public static PaResPassStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaResPassStepModelElement.STEREOTYPE_NAME);
        return PaResPassStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PaResPassStepModelElement} proxy from a {@link ModelElement} stereotyped << PaResPassStep_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PaResPassStepModelElement} proxy or <i>null</i>.
     */
    @objid ("f97aaaea-1982-4379-8763-b839070cef09")
    public static PaResPassStepModelElement instantiate(final ModelElement obj) {
        return PaResPassStepModelElement.canInstantiate(obj) ? new PaResPassStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaResPassStepModelElement} proxy from a {@link ModelElement} stereotyped << PaResPassStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PaResPassStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4cd93ec3-4a43-4fc1-8bcc-472068f33f66")
    public static PaResPassStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PaResPassStepModelElement.canInstantiate(obj))
        	return new PaResPassStepModelElement(obj);
        else
        	throw new IllegalArgumentException("PaResPassStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c679bd00-8081-4af0-a0c7-4e5a6c3175be")
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
        PaResPassStepModelElement other = (PaResPassStepModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("f8255f22-820d-49df-a908-c7614ec53c53")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'PaResPassStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("326df754-061a-4ca5-a9c5-d216e9ff4cb1")
    public String getPaResPassStep_ModelElement_resUnits() {
        return this.elt.getTagValue(PaResPassStepModelElement.MdaTypes.PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaResPassStep_ModelElement_resource'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72355f4a-d798-479c-b234-9648e4bb6cf8")
    public String getPaResPassStep_ModelElement_resource() {
        return this.elt.getTagValue(PaResPassStepModelElement.MdaTypes.PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE_ELT);
    }

    @objid ("530a2a24-086d-4c02-9d97-9605a9ba306d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaResPassStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("01c7d059-c6f3-4351-9b9f-6a1a83ee4413")
    public void setPaResPassStep_ModelElement_resUnits(final String value) {
        this.elt.putTagValue(PaResPassStepModelElement.MdaTypes.PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaResPassStep_ModelElement_resource'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b53af7a7-9661-4a2c-8f70-6fd16b54401c")
    public void setPaResPassStep_ModelElement_resource(final String value) {
        this.elt.putTagValue(PaResPassStepModelElement.MdaTypes.PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE_ELT, value);
    }

    @objid ("3605d5e9-c9f5-46c0-8d8a-2d81d512ad6f")
    protected PaResPassStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("787c56f8-0750-4b50-aeb8-10c406e27ca2")
    public static final class MdaTypes {
        @objid ("334a6aa1-3a4b-431d-b888-068ace26aa04")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c4c46208-ce3e-4135-a5a6-2b064f37463d")
        public static TagType PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE_ELT;

        @objid ("511e83c7-d961-4011-b652-b0467c47532a")
        public static TagType PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT;

        @objid ("9c190e32-2d24-4990-bbac-912572b0ccb9")
        private static Stereotype MDAASSOCDEP;

        @objid ("c54375fe-c7fd-42ef-a649-a236941e99f1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2cf3d929-6c77-4e19-af5e-89d8faf542ed")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "06480ffa-14b2-11df-9d54-0014222a9f79");
            PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "06480ffb-14b2-11df-9d54-0014222a9f79");
            PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "06480ffc-14b2-11df-9d54-0014222a9f79");
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
