/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << GaRelStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3d201e79-7d67-4f18-9b2b-836ce555b398")
public class GaRelStepModelElement extends GaStepModelElement {
    @objid ("c3ad2c6d-1d26-4a8e-98ae-cb30f642b431")
    public static final String STEREOTYPE_NAME = "GaRelStep_ModelElement";

    @objid ("09259d5a-dd1a-4d60-a801-ab3b72cf7e19")
    public static final String GARELSTEP_MODELELEMENT_RELRES_TAGTYPE = "GaRelStep_ModelElement_relRes";

    @objid ("aceb1469-00d1-4c0f-9807-763c693d7098")
    public static final String GARELSTEP_MODELELEMENT_RESUNITS_TAGTYPE = "GaRelStep_ModelElement_resUnits";

    /**
     * Tells whether a {@link GaRelStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaRelStep_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("36e6bfc2-922c-480c-8478-0eadcb2de6c6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaRelStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaRelStep_ModelElement >> then instantiate a {@link GaRelStepModelElement} proxy.
     * 
     * @return a {@link GaRelStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("94291370-a45f-4111-884d-67984fe9291d")
    public static GaRelStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaRelStepModelElement.STEREOTYPE_NAME);
        return GaRelStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaRelStepModelElement} proxy from a {@link ModelElement} stereotyped << GaRelStep_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaRelStepModelElement} proxy or <i>null</i>.
     */
    @objid ("5f99710a-1428-41ba-ac1e-4908985db99b")
    public static GaRelStepModelElement instantiate(final ModelElement obj) {
        return GaRelStepModelElement.canInstantiate(obj) ? new GaRelStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaRelStepModelElement} proxy from a {@link ModelElement} stereotyped << GaRelStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link GaRelStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9215208f-f097-417e-bfe2-211d2cffd87b")
    public static GaRelStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaRelStepModelElement.canInstantiate(obj))
        	return new GaRelStepModelElement(obj);
        else
        	throw new IllegalArgumentException("GaRelStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0ce74147-5160-4bc0-80dd-d8b491a4395a")
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
        GaRelStepModelElement other = (GaRelStepModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("427edf98-d6a7-4ace-a648-7aea59ff9f80")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'GaRelStep_ModelElement_relRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d8a30ee-5949-44c9-ae99-030a9c7065fa")
    public String getGaRelStep_ModelElement_relRes() {
        return this.elt.getTagValue(GaRelStepModelElement.MdaTypes.GARELSTEP_MODELELEMENT_RELRES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaRelStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be2917ad-69af-4afd-b78c-7085155e9932")
    public String getGaRelStep_ModelElement_resUnits() {
        return this.elt.getTagValue(GaRelStepModelElement.MdaTypes.GARELSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT);
    }

    @objid ("b6789783-bda0-46fa-9d7d-cf12d0020eda")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaRelStep_ModelElement_relRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30556609-6b67-4148-81b2-e42ff9f15b32")
    public void setGaRelStep_ModelElement_relRes(final String value) {
        this.elt.putTagValue(GaRelStepModelElement.MdaTypes.GARELSTEP_MODELELEMENT_RELRES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaRelStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3413e2b9-09a8-489d-a328-44dbfad167d0")
    public void setGaRelStep_ModelElement_resUnits(final String value) {
        this.elt.putTagValue(GaRelStepModelElement.MdaTypes.GARELSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT, value);
    }

    @objid ("5106b965-73b9-4c79-b1e0-5bdd7aec5c8b")
    protected GaRelStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("f3d38296-f2c7-4d06-b617-2068354509c8")
    public static final class MdaTypes {
        @objid ("3d92f3c8-26eb-48ff-b6a2-2235117a4284")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6b5a1464-b7c6-4397-9256-5176c8e476bd")
        public static TagType GARELSTEP_MODELELEMENT_RELRES_TAGTYPE_ELT;

        @objid ("a8c6ba1a-b993-4ee7-9364-22346a033ea9")
        public static TagType GARELSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT;

        @objid ("ca89f181-1317-4172-937a-73c1ca94f507")
        private static Stereotype MDAASSOCDEP;

        @objid ("7ff7d973-847e-4f6d-b92c-39c319dd3383")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("92794dc3-d45d-4a2b-b400-aebdf22135a2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03550caa-0ccf-11df-8525-001302895b2b");
            GARELSTEP_MODELELEMENT_RELRES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035c339e-0ccf-11df-8525-001302895b2b");
            GARELSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035c339f-0ccf-11df-8525-001302895b2b");
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
