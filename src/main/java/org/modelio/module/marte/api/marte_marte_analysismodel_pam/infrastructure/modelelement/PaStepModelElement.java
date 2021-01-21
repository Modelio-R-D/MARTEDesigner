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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaStepModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << PaStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fcebb9a7-a8bd-4a2a-bea3-c01508d7b9bb")
public class PaStepModelElement extends GaStepModelElement {
    @objid ("68a545d4-ef15-41f4-bcfb-c5f3875e213d")
    public static final String STEREOTYPE_NAME = "PaStep_ModelElement";

    @objid ("183a4f5b-04f5-456e-8b6d-828bc87d97ba")
    public static final String PASTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE = "PaStep_ModelElement_behavCount";

    @objid ("058c436f-2ad2-41ed-9abc-eb4e77ec10ca")
    public static final String PASTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE = "PaStep_ModelElement_behavDemand";

    @objid ("02ece728-efc0-425d-88ae-f3d06747632c")
    public static final String PASTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE = "PaStep_ModelElement_extOpCount";

    @objid ("31bc6b67-2032-49ff-baff-126f648e55b6")
    public static final String PASTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE = "PaStep_ModelElement_extOpDemand";

    @objid ("5890a730-d5b0-42a9-b93e-91252d5f817f")
    public static final String PASTEP_MODELELEMENT_NOSYNC_TAGTYPE = "PaStep_ModelElement_noSync";

    /**
     * Tells whether a {@link PaStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PaStep_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c0b8574a-adba-4921-ad6f-f9545503a549")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PaStep_ModelElement >> then instantiate a {@link PaStepModelElement} proxy.
     * 
     * @return a {@link PaStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("abb26d1e-2b2d-4db9-ba62-e9267b0ae28c")
    public static PaStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaStepModelElement.STEREOTYPE_NAME);
        return PaStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PaStepModelElement} proxy from a {@link ModelElement} stereotyped << PaStep_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PaStepModelElement} proxy or <i>null</i>.
     */
    @objid ("fdcf2732-9d93-44b2-a06c-9fa178f3924a")
    public static PaStepModelElement instantiate(final ModelElement obj) {
        return PaStepModelElement.canInstantiate(obj) ? new PaStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaStepModelElement} proxy from a {@link ModelElement} stereotyped << PaStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PaStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1578f345-781e-47b2-86c5-5a588dd71787")
    public static PaStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PaStepModelElement.canInstantiate(obj))
        	return new PaStepModelElement(obj);
        else
        	throw new IllegalArgumentException("PaStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a10cb14f-e21f-4d1e-8bc6-3350af6a72b3")
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
        PaStepModelElement other = (PaStepModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("2de5e6c9-a0b3-485c-b828-81b960f360e7")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for List<String> property 'PaStep_ModelElement_behavCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e90e74be-e851-4d31-98fd-21c8bdeab103")
    public List<String> getPaStep_ModelElement_behavCount() {
        return this.elt.getTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaStep_ModelElement_behavDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("73859559-0126-43c5-b636-83fa388c7e7e")
    public List<String> getPaStep_ModelElement_behavDemand() {
        return this.elt.getTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaStep_ModelElement_extOpCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("69b84d0a-aff0-4c45-8927-5cdf8386c64f")
    public List<String> getPaStep_ModelElement_extOpCount() {
        return this.elt.getTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaStep_ModelElement_extOpDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f5582e6d-b66d-4b09-9c13-4e0d93187858")
    public List<String> getPaStep_ModelElement_extOpDemand() {
        return this.elt.getTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT);
    }

    @objid ("23affdfb-8eb8-467d-adbf-a5a6b57b4b6d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'PaStep_ModelElement_noSync'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5787823a-6cce-44d1-8466-cef828771345")
    public boolean isPaStep_ModelElement_noSync() {
        return this.elt.isTagged(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'PaStep_ModelElement_behavCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("150962d3-7f3c-46a1-84eb-3dd57e7eefe5")
    public void setPaStep_ModelElement_behavCount(final List<String> values) {
        this.elt.putTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaStep_ModelElement_behavDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7929cb5e-d7fe-4d3b-a1db-69c3430eafc6")
    public void setPaStep_ModelElement_behavDemand(final List<String> values) {
        this.elt.putTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaStep_ModelElement_extOpCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d6168c8-e337-424e-abff-ffe005567d8f")
    public void setPaStep_ModelElement_extOpCount(final List<String> values) {
        this.elt.putTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaStep_ModelElement_extOpDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d3e2029-a946-4d54-a2de-ffa456cb46b7")
    public void setPaStep_ModelElement_extOpDemand(final List<String> values) {
        this.elt.putTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'PaStep_ModelElement_noSync'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("004244d7-a4c0-4b3e-afe9-1958eb2f37c2")
    public void setPaStep_ModelElement_noSync(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT);
    }

    @objid ("9add9938-e864-4b91-8e7f-6bf08eec5816")
    protected PaStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("115ce582-aa4e-4719-87e9-aff54fe4e6d5")
    public static final class MdaTypes {
        @objid ("0fac7fdc-ce81-4f7f-b08c-2065be93c7a6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5e259c3a-2fb7-4260-a52f-20dcfdf18172")
        public static TagType PASTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT;

        @objid ("8e1bede6-9302-4abc-833e-71b77f6def8e")
        public static TagType PASTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT;

        @objid ("7d58c3ae-59d2-4571-8288-4f2351465796")
        public static TagType PASTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT;

        @objid ("995bff9e-c397-40fc-a8b6-883d9347f1b6")
        public static TagType PASTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT;

        @objid ("1c4e5a90-9c90-4032-bd3e-c0219317ad75")
        public static TagType PASTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT;

        @objid ("46e03228-8e87-4967-8997-8a7927da7f1a")
        private static Stereotype MDAASSOCDEP;

        @objid ("d88697e7-283c-4e97-9072-a10211a60e06")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e072f783-805f-431d-9001-612d56176794")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9a49388e-14b1-11df-9d54-0014222a9f79");
            PASTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a49388f-14b1-11df-9d54-0014222a9f79");
            PASTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a493890-14b1-11df-9d54-0014222a9f79");
            PASTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a493891-14b1-11df-9d54-0014222a9f79");
            PASTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a493892-14b1-11df-9d54-0014222a9f79");
            PASTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a493893-14b1-11df-9d54-0014222a9f79");
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
