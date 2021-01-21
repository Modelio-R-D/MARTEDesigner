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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaCommStepModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << PaCommStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1792dd01-8b42-4575-8254-0b372756f5bb")
public class PaCommStepModelElement extends GaCommStepModelElement {
    @objid ("73b20e23-cbc1-43a2-8d98-e2a2696d8573")
    public static final String STEREOTYPE_NAME = "PaCommStep_ModelElement";

    @objid ("04ee7b04-20a7-46bf-ac36-3b6a8717261f")
    public static final String PACOMMSTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE = "PaCommStep_ModelElement_behavCount";

    @objid ("4074c4f9-a30c-4806-b6cf-8eb077041d9d")
    public static final String PACOMMSTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE = "PaCommStep_ModelElement_behavDemand";

    @objid ("7998c22b-22aa-44ec-828e-b338f6fe7166")
    public static final String PACOMMSTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE = "PaCommStep_ModelElement_extOpCount";

    @objid ("9e45bbb7-9a25-4a0d-af4a-eb4c4b22d609")
    public static final String PACOMMSTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE = "PaCommStep_ModelElement_extOpDemand";

    @objid ("4dfb84e3-7b45-4102-a971-3be14643a685")
    public static final String PACOMMSTEP_MODELELEMENT_NOSYNC_TAGTYPE = "PaCommStep_ModelElement_noSync";

    /**
     * Tells whether a {@link PaCommStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PaCommStep_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("64efc31d-f72b-45c9-841a-b34db647d701")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaCommStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PaCommStep_ModelElement >> then instantiate a {@link PaCommStepModelElement} proxy.
     * 
     * @return a {@link PaCommStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("0ca253d5-00b4-42f8-a26a-23e74f954b98")
    public static PaCommStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaCommStepModelElement.STEREOTYPE_NAME);
        return PaCommStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PaCommStepModelElement} proxy from a {@link ModelElement} stereotyped << PaCommStep_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PaCommStepModelElement} proxy or <i>null</i>.
     */
    @objid ("bed1adbb-d56f-4e55-8a56-c51720ab01fd")
    public static PaCommStepModelElement instantiate(final ModelElement obj) {
        return PaCommStepModelElement.canInstantiate(obj) ? new PaCommStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaCommStepModelElement} proxy from a {@link ModelElement} stereotyped << PaCommStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PaCommStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e82f9a9a-1cb3-451b-9e26-310270e9d1f7")
    public static PaCommStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PaCommStepModelElement.canInstantiate(obj))
        	return new PaCommStepModelElement(obj);
        else
        	throw new IllegalArgumentException("PaCommStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("36ba48e3-36b3-4a15-b328-c14d9dcbf8d2")
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
        PaCommStepModelElement other = (PaCommStepModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("d6c646a3-a68e-46da-865c-fe6c70dea50e")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for List<String> property 'PaCommStep_ModelElement_behavCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f07b7ea7-ba23-442e-83ed-5741836ab8b3")
    public List<String> getPaCommStep_ModelElement_behavCount() {
        return this.elt.getTagValues(PaCommStepModelElement.MdaTypes.PACOMMSTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaCommStep_ModelElement_behavDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e431ed67-3524-4c55-8946-63496ec2a107")
    public List<String> getPaCommStep_ModelElement_behavDemand() {
        return this.elt.getTagValues(PaCommStepModelElement.MdaTypes.PACOMMSTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaCommStep_ModelElement_extOpCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("39dc9cd0-2880-4db9-8d71-56b32609b0e6")
    public List<String> getPaCommStep_ModelElement_extOpCount() {
        return this.elt.getTagValues(PaCommStepModelElement.MdaTypes.PACOMMSTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaCommStep_ModelElement_extOpDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9ec957ba-4fab-416c-9048-5a758ed7a79b")
    public List<String> getPaCommStep_ModelElement_extOpDemand() {
        return this.elt.getTagValues(PaCommStepModelElement.MdaTypes.PACOMMSTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT);
    }

    @objid ("6f9de120-6a68-437e-9fa7-61a9295f83b1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'PaCommStep_ModelElement_noSync'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd59cb94-c867-46ab-89a2-8b351c4f7e0d")
    public boolean isPaCommStep_ModelElement_noSync() {
        return this.elt.isTagged(PaCommStepModelElement.MdaTypes.PACOMMSTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'PaCommStep_ModelElement_behavCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cde2a86a-26e8-43a5-8372-151420fc3bbc")
    public void setPaCommStep_ModelElement_behavCount(final List<String> values) {
        this.elt.putTagValues(PaCommStepModelElement.MdaTypes.PACOMMSTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaCommStep_ModelElement_behavDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9b3099f9-8ec3-4460-b7c5-77384a5737f3")
    public void setPaCommStep_ModelElement_behavDemand(final List<String> values) {
        this.elt.putTagValues(PaCommStepModelElement.MdaTypes.PACOMMSTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaCommStep_ModelElement_extOpCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1591cb6-e605-4393-b5c3-8801cf2a59ca")
    public void setPaCommStep_ModelElement_extOpCount(final List<String> values) {
        this.elt.putTagValues(PaCommStepModelElement.MdaTypes.PACOMMSTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaCommStep_ModelElement_extOpDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cdf2b8b3-18ad-4d21-8b2f-ab00e6d8bd19")
    public void setPaCommStep_ModelElement_extOpDemand(final List<String> values) {
        this.elt.putTagValues(PaCommStepModelElement.MdaTypes.PACOMMSTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'PaCommStep_ModelElement_noSync'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d45e8505-8aff-4a7c-ba1b-b5a377f843be")
    public void setPaCommStep_ModelElement_noSync(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(PaCommStepModelElement.MdaTypes.PACOMMSTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(PaCommStepModelElement.MdaTypes.PACOMMSTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT);
    }

    @objid ("a920fb2e-4b42-4d94-aabb-e31c76229f7a")
    protected PaCommStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("feef67a7-4f2a-41d8-b44f-bee5c43ad5e4")
    public static final class MdaTypes {
        @objid ("fa23af71-57db-443b-9785-c6f965952d15")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0fd0c8b0-79a4-4e20-aa7d-e8a9f1569743")
        public static TagType PACOMMSTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT;

        @objid ("2f83b20b-5391-43ab-946a-abd9bcd8462b")
        public static TagType PACOMMSTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT;

        @objid ("7c34d458-a5b1-4c11-9ad3-3a0a765661e8")
        public static TagType PACOMMSTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT;

        @objid ("e32fd998-713d-45dc-86ba-f6cece460735")
        public static TagType PACOMMSTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT;

        @objid ("dbe4432d-cb06-4ba0-bed6-c5722cd92f21")
        public static TagType PACOMMSTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT;

        @objid ("46e8ede6-a5bb-40d3-9536-49669be506d8")
        private static Stereotype MDAASSOCDEP;

        @objid ("05721440-0a9f-479b-92b0-58e760542563")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8b5eb1a7-264b-4984-84ee-eda66684808e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ccb9e376-14b1-11df-9d54-0014222a9f79");
            PACOMMSTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "42a34237-16f1-11df-b92a-0014222a9f79");
            PACOMMSTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "42a34238-16f1-11df-b92a-0014222a9f79");
            PACOMMSTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "42a34239-16f1-11df-b92a-0014222a9f79");
            PACOMMSTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "42a3423a-16f1-11df-b92a-0014222a9f79");
            PACOMMSTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "42a3423b-16f1-11df-b92a-0014222a9f79");
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
