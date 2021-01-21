/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("e29d36c1-f0de-4c9e-be20-1f2a4b1a904d")
    public static final String STEREOTYPE_NAME = "PaRequestedService_ModelElement";

    @objid ("b5397cb2-0da9-4ba2-9504-a3569df4b401")
    public static final String PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT_TAGTYPE = "PaRequestedService_ModelElement_behavCount";

    @objid ("02b47424-e2df-43b4-a3d0-89123d666f90")
    public static final String PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND_TAGTYPE = "PaRequestedService_ModelElement_behavDemand";

    @objid ("6702dade-3a8d-4e09-b235-3a2c71c16c89")
    public static final String PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT_TAGTYPE = "PaRequestedService_ModelElement_extOpCount";

    @objid ("964364fd-0c31-4518-92ba-ca9b1bfa97c2")
    public static final String PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND_TAGTYPE = "PaRequestedService_ModelElement_extOpDemand";

    @objid ("01e37910-5e9a-4d49-b148-9223f543220f")
    public static final String PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE = "PaRequestedService_ModelElement_noSync";

    /**
     * Tells whether a {@link PaRequestedServiceModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PaRequestedService_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8c65c661-1463-4bda-bcf4-24dee957dea9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaRequestedServiceModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PaRequestedService_ModelElement >> then instantiate a {@link PaRequestedServiceModelElement} proxy.
     * 
     * @return a {@link PaRequestedServiceModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("2b55a372-5657-41b9-984c-9726266d9e3e")
    public static PaRequestedServiceModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaRequestedServiceModelElement.STEREOTYPE_NAME);
        return PaRequestedServiceModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PaRequestedServiceModelElement} proxy from a {@link ModelElement} stereotyped << PaRequestedService_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PaRequestedServiceModelElement} proxy or <i>null</i>.
     */
    @objid ("ab5232dc-60a3-4ba7-8f82-40b41d45885f")
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
    @objid ("a0d7d0c2-ba1d-4818-b5bd-a8d519f4fdbc")
    public static PaRequestedServiceModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PaRequestedServiceModelElement.canInstantiate(obj))
        	return new PaRequestedServiceModelElement(obj);
        else
        	throw new IllegalArgumentException("PaRequestedServiceModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("526d427f-94b6-435c-9ad4-ebe9afcf114a")
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
    @objid ("1b119661-1a07-4b6c-b698-2ab29c92f009")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for List<String> property 'PaRequestedService_ModelElement_behavCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1caf5ff8-c2f7-494b-92a6-806ce612f2c9")
    public List<String> getPaRequestedService_ModelElement_behavCount() {
        return this.elt.getTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaRequestedService_ModelElement_behavDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("54578be0-9652-4101-8807-95574f5fa729")
    public List<String> getPaRequestedService_ModelElement_behavDemand() {
        return this.elt.getTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaRequestedService_ModelElement_extOpCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c3bfe884-c235-4c75-b453-13a25905c0e9")
    public List<String> getPaRequestedService_ModelElement_extOpCount() {
        return this.elt.getTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaRequestedService_ModelElement_extOpDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e9c3578e-feff-4ed5-bf4f-ecf6b1a951e5")
    public List<String> getPaRequestedService_ModelElement_extOpDemand() {
        return this.elt.getTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT);
    }

    @objid ("fc20fb20-7489-4d7c-97b8-cea40dc23c7d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'PaRequestedService_ModelElement_noSync'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("df34eae3-3428-497c-96eb-b0e70ef17bc9")
    public boolean isPaRequestedService_ModelElement_noSync() {
        return this.elt.isTagged(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'PaRequestedService_ModelElement_behavCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d5246d49-282e-4610-a591-fcf8c50b5f6f")
    public void setPaRequestedService_ModelElement_behavCount(final List<String> values) {
        this.elt.putTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaRequestedService_ModelElement_behavDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be0f3779-526f-44e4-ab7d-e719c28b0aae")
    public void setPaRequestedService_ModelElement_behavDemand(final List<String> values) {
        this.elt.putTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaRequestedService_ModelElement_extOpCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ff8f764b-beb8-4ff0-9c21-7b0c8ae9b279")
    public void setPaRequestedService_ModelElement_extOpCount(final List<String> values) {
        this.elt.putTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaRequestedService_ModelElement_extOpDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f1a3aac-da4b-4102-96b0-14ee9cb6cbf0")
    public void setPaRequestedService_ModelElement_extOpDemand(final List<String> values) {
        this.elt.putTagValues(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'PaRequestedService_ModelElement_noSync'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17c5afcc-67ce-4615-b9ad-04c9b72216de")
    public void setPaRequestedService_ModelElement_noSync(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(PaRequestedServiceModelElement.MdaTypes.PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE_ELT);
    }

    @objid ("7af2cb82-2625-442f-9765-5341b8989575")
    protected PaRequestedServiceModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("127b30e0-b1ca-4332-ba36-5ab38d901f72")
    public static final class MdaTypes {
        @objid ("6304f684-9f4a-4612-ae92-612a772133fa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8dbb8fc8-5ea9-40db-93b8-0c543dd5962f")
        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_NOSYNC_TAGTYPE_ELT;

        @objid ("032e5917-af4f-40b7-aa3c-ba3cb171e265")
        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT;

        @objid ("0dad00e2-b596-498d-a250-e22f5fe4f838")
        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT;

        @objid ("065e1ec4-999b-4b66-9c36-a742a10c8303")
        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT;

        @objid ("3d6b3565-d391-44fd-b0af-fc7bf0f73c61")
        public static TagType PAREQUESTEDSERVICE_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT;

        @objid ("47ed3973-8b60-486d-bfd4-7c4501ee0481")
        private static Stereotype MDAASSOCDEP;

        @objid ("52bd2658-52aa-43e7-af6b-37963a24243b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d0d95220-3656-4f5c-9e2b-5bbdc8758cac")
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
