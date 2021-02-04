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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaRequestedServiceModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << PaRequestedService_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4b6fbf64-0007-4816-af0e-6228d0e115e7")
public class PaRequestedServiceModelElement extends GaRequestedServiceModelElement {
    @objid ("3cdcf813-e401-4595-8211-27dcdcb1c336")
    public static final String STEREOTYPE_NAME = "PaRequestedService_ModelElement";

    @objid ("829b303c-f29a-4709-b49c-fc58668c04c1")
    public static final String PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT_TAGTYPE = "PaRequestedService_ModelElement_behavCount";

    @objid ("4e560a54-fc23-459a-9db8-5ce6e40b9b9e")
    public static final String PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND_TAGTYPE = "PaRequestedService_ModelElement_behavDemand";

    @objid ("9aaf04a4-77e3-49ca-9251-9343f11c025d")
    public static final String PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT_TAGTYPE = "PaRequestedService_ModelElement_extOpCount";

    @objid ("2385597b-299f-49b5-b1f7-f956ddd7ec98")
    public static final String PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND_TAGTYPE = "PaRequestedService_ModelElement_extOpDemand";

    @objid ("1f101080-c812-440c-bf6a-8b31a4b284d9")
    public static final String PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE = "PaRequestedService_ModelElement_noSync";

    /**
     * Tells whether a {@link PaRequestedServiceModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PaRequestedService_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("193f4e87-be8f-4f67-bee7-8f5a3020e25a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaRequestedServiceModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PaRequestedService_ModelElement >> then instantiate a {@link PaRequestedServiceModelElement} proxy.
     * 
     * @return a {@link PaRequestedServiceModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("b470a55c-ab2e-4da3-98d3-5a4cb77295bc")
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
    @objid ("b47d6143-c932-4234-936b-370528306926")
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
    @objid ("b92857e2-2094-4d27-a256-441a880663b2")
    public static PaRequestedServiceModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PaRequestedServiceModelElement.canInstantiate(obj))
        	return new PaRequestedServiceModelElement(obj);
        else
        	throw new IllegalArgumentException("PaRequestedServiceModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c1f16440-438f-48e9-af97-8c4a5d6efb5b")
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
    @objid ("0a47f3da-4ff7-4c1e-9bca-a4a34c4e632a")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for List<String> property 'PaRequestedService_ModelElement_behavCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0290f999-b9a9-427a-a0b8-8e51e7603e58")
    public List<String> getPaRequestedService_ModelElement_behavCount() {
        return this.elt.getTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaRequestedService_ModelElement_behavDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bcfe9acb-6695-4d4b-9d08-6220cb13e66d")
    public List<String> getPaRequestedService_ModelElement_behavDemand() {
        return this.elt.getTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaRequestedService_ModelElement_extOpCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("24f54bce-92ae-4d48-b2e4-16c01b12ce1f")
    public List<String> getPaRequestedService_ModelElement_extOpCount() {
        return this.elt.getTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaRequestedService_ModelElement_extOpDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2cfb2f27-5752-4f6b-9e94-ef3dba69821a")
    public List<String> getPaRequestedService_ModelElement_extOpDemand() {
        return this.elt.getTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT);
    }

    @objid ("0ffba5c4-bcd6-4aeb-a1ea-89fc75a6f5d0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'PaRequestedService_ModelElement_noSync'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e38a58c-9954-4716-a2dd-7fc6dbb496cc")
    public boolean isPaRequestedService_ModelElement_noSync() {
        return this.elt.isTagged(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'PaRequestedService_ModelElement_behavCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1f7e5f5-6d24-4e4b-9370-a2b1e76f6072")
    public void setPaRequestedService_ModelElement_behavCount(final List<String> values) {
        this.elt.putTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaRequestedService_ModelElement_behavDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d9fba4b6-150b-40b0-9e00-3da92815a8c3")
    public void setPaRequestedService_ModelElement_behavDemand(final List<String> values) {
        this.elt.putTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaRequestedService_ModelElement_extOpCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c9e1d4b-ebab-4335-a3b1-da72a6554f43")
    public void setPaRequestedService_ModelElement_extOpCount(final List<String> values) {
        this.elt.putTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaRequestedService_ModelElement_extOpDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ecf7d233-f796-4677-9f15-d0f2537a5c02")
    public void setPaRequestedService_ModelElement_extOpDemand(final List<String> values) {
        this.elt.putTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'PaRequestedService_ModelElement_noSync'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d2972541-4cd7-4247-9afb-516f8a0fb891")
    public void setPaRequestedService_ModelElement_noSync(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE_ELT);
    }

    @objid ("8449aae4-109f-44c8-9390-1c7126958550")
    protected PaRequestedServiceModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("127b30e0-b1ca-4332-ba36-5ab38d901f72")
    public static final class MdaTypes {
        @objid ("1cf02a91-e79e-4ce1-af13-e7b16cb37ffb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e3fddaa4-dd5a-4228-83a2-f8050f0d47b0")
        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE_ELT;

        @objid ("58832856-6163-46bb-b3c8-96d4d72985d9")
        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT;

        @objid ("fb5defe4-f99d-4d1f-b516-dd404b0e1b07")
        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT;

        @objid ("1e517cf1-d9de-47f6-b124-643320aa85c1")
        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT;

        @objid ("29abe7c5-69dc-4f16-9f43-83bfab992efa")
        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT;

        @objid ("6bfe1ab0-adee-4c56-b344-c10ba580a78d")
        private static Stereotype MDAASSOCDEP;

        @objid ("84c43525-d54e-4197-b5c2-74e11fe964ed")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("83fd875d-3b13-4f82-ad41-5ac32fa4b1b5")
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
