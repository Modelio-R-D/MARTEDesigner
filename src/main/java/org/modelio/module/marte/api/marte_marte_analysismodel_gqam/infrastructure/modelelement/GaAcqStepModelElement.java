/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << GaAcqStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("50a805d5-32bd-4c99-aa79-3ef7ff035188")
public class GaAcqStepModelElement extends GaStepModelElement {
    @objid ("5ae7c2e7-fd70-49d7-b46c-be9c6c4b50e3")
    public static final String STEREOTYPE_NAME = "GaAcqStep_ModelElement";

    @objid ("eaf8edab-bf75-4a8d-b579-4349fc1cf644")
    public static final String GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE = "GaAcqStep_ModelElement_acqRes";

    @objid ("0a3f5317-40b9-40ed-965c-11930bcaad04")
    public static final String GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE = "GaAcqStep_ModelElement_resUnits";

    /**
     * Tells whether a {@link GaAcqStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaAcqStep_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f1e42d40-34e4-4b11-8076-a17c5ab3e5ce")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaAcqStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaAcqStep_ModelElement >> then instantiate a {@link GaAcqStepModelElement} proxy.
     * 
     * @return a {@link GaAcqStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("de157cc9-9aae-42d1-b337-db37be06a05b")
    public static GaAcqStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaAcqStepModelElement.STEREOTYPE_NAME);
        return GaAcqStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaAcqStepModelElement} proxy from a {@link ModelElement} stereotyped << GaAcqStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaAcqStepModelElement} proxy or <i>null</i>.
     */
    @objid ("d236e8c1-03fe-49e6-833d-6703679f535d")
    public static GaAcqStepModelElement instantiate(final ModelElement obj) {
        return GaAcqStepModelElement.canInstantiate(obj) ? new GaAcqStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaAcqStepModelElement} proxy from a {@link ModelElement} stereotyped << GaAcqStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link GaAcqStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a79b5f51-df31-4743-9468-0ae001b530e1")
    public static GaAcqStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaAcqStepModelElement.canInstantiate(obj))
        	return new GaAcqStepModelElement(obj);
        else
        	throw new IllegalArgumentException("GaAcqStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ffa76845-783d-4a90-af88-3836b4c7e7ba")
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
        GaAcqStepModelElement other = (GaAcqStepModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("30ac4a40-9d9d-4434-a384-4e0cf79277af")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'GaAcqStep_ModelElement_acqRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ec674cf-279c-4fd6-b744-29f3f5eb94b3")
    public String getGaAcqStep_ModelElement_acqRes() {
        return this.elt.getTagValue(GaAcqStepModelElement.MdaTypes.GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaAcqStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5f28f944-39e7-406e-9f21-86a346ae6695")
    public String getGaAcqStep_ModelElement_resUnits() {
        return this.elt.getTagValue(GaAcqStepModelElement.MdaTypes.GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT);
    }

    @objid ("3d27374d-72b5-419c-b87f-321c8bc222ea")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaAcqStep_ModelElement_acqRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1d22a464-a3a4-4dad-95ee-316b17275fc5")
    public void setGaAcqStep_ModelElement_acqRes(final String value) {
        this.elt.putTagValue(GaAcqStepModelElement.MdaTypes.GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaAcqStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1ed0b10-ed52-48e0-b0a3-b45d2534bb8b")
    public void setGaAcqStep_ModelElement_resUnits(final String value) {
        this.elt.putTagValue(GaAcqStepModelElement.MdaTypes.GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT, value);
    }

    @objid ("7c00a43f-e780-4914-bb75-97feb2f7c126")
    protected GaAcqStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("e559ea55-92fb-43df-a357-2e6c6240f5a4")
    public static final class MdaTypes {
        @objid ("cccf8520-26da-46fa-bf1a-1c2d0a6b43f3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e74fffb1-117c-4992-a954-ed3770afeb4a")
        public static TagType GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE_ELT;

        @objid ("ce9666a4-71bd-4a2a-8977-1b076b1789ef")
        public static TagType GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT;

        @objid ("4004341a-dd69-41f2-98b2-79352df7029b")
        private static Stereotype MDAASSOCDEP;

        @objid ("2595ff66-772d-4add-956f-2ac3cefb3444")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("93da1abb-e718-44f1-88f2-94ffc46ba4ee")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9416a01d-149e-11df-9d54-0014222a9f79");
            GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9416a01e-149e-11df-9d54-0014222a9f79");
            GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9416a01f-149e-11df-9d54-0014222a9f79");
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
