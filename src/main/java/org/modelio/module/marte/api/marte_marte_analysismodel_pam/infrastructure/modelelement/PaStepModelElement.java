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
    @objid ("4751a99d-b619-4fc1-8a74-91e3f69dbaf5")
    public static final String STEREOTYPE_NAME = "PaStep_ModelElement";

    @objid ("a7c8c1dd-85eb-46b4-9e1c-7611aace60cf")
    public static final String PASTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE = "PaStep_ModelElement_behavCount";

    @objid ("91482c95-7b99-4ede-afb5-b787c483f723")
    public static final String PASTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE = "PaStep_ModelElement_behavDemand";

    @objid ("fad82e68-6fc2-49f9-b777-f54b388df548")
    public static final String PASTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE = "PaStep_ModelElement_extOpCount";

    @objid ("7d7589cb-1bed-4ee2-b40f-241c67215e07")
    public static final String PASTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE = "PaStep_ModelElement_extOpDemand";

    @objid ("2781639f-d348-4df6-9922-dc7029669550")
    public static final String PASTEP_MODELELEMENT_NOSYNC_TAGTYPE = "PaStep_ModelElement_noSync";

    /**
     * Tells whether a {@link PaStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PaStep_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("03ea3175-5307-40e7-9032-388891fba227")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PaStep_ModelElement >> then instantiate a {@link PaStepModelElement} proxy.
     * 
     * @return a {@link PaStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("0feaaac4-a18d-4144-b7b3-a088b8c179a8")
    public static PaStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaStepModelElement.STEREOTYPE_NAME);
        return PaStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PaStepModelElement} proxy from a {@link ModelElement} stereotyped << PaStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PaStepModelElement} proxy or <i>null</i>.
     */
    @objid ("5ac6e285-645e-4cd2-be87-d7369ebd47e6")
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
    @objid ("5cab9b91-fe1d-4a48-9b9f-116ebd723d10")
    public static PaStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PaStepModelElement.canInstantiate(obj))
        	return new PaStepModelElement(obj);
        else
        	throw new IllegalArgumentException("PaStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8586aa3e-381b-4e82-959d-3024860f9f8e")
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
    @objid ("78b01347-1f41-4ab5-bc83-b311ba76ba6b")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for List<String> property 'PaStep_ModelElement_behavCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("25239ee7-7cf7-4b16-be32-1795a4011486")
    public List<String> getPaStep_ModelElement_behavCount() {
        return this.elt.getTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaStep_ModelElement_behavDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2e15bdb0-af78-4648-86fe-20d2e21d983d")
    public List<String> getPaStep_ModelElement_behavDemand() {
        return this.elt.getTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaStep_ModelElement_extOpCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("89d37a8b-d3fe-4e06-9a69-fa5df0460b9e")
    public List<String> getPaStep_ModelElement_extOpCount() {
        return this.elt.getTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'PaStep_ModelElement_extOpDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4a2c798b-433a-49cb-95fb-5d1742a954c5")
    public List<String> getPaStep_ModelElement_extOpDemand() {
        return this.elt.getTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT);
    }

    @objid ("49fe01c8-06d6-437a-8de8-98b94137c586")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'PaStep_ModelElement_noSync'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("78b8881c-0a7f-4473-b035-45965a95f534")
    public boolean isPaStep_ModelElement_noSync() {
        return this.elt.isTagged(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'PaStep_ModelElement_behavCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("819eeca9-951a-49fb-9109-b0765b67f7ae")
    public void setPaStep_ModelElement_behavCount(final List<String> values) {
        this.elt.putTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaStep_ModelElement_behavDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("64789efe-404f-4f17-bc82-9541df26e02f")
    public void setPaStep_ModelElement_behavDemand(final List<String> values) {
        this.elt.putTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaStep_ModelElement_extOpCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d20ab5c0-6abe-4935-976a-d6030a1183c2")
    public void setPaStep_ModelElement_extOpCount(final List<String> values) {
        this.elt.putTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'PaStep_ModelElement_extOpDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f7f3cb3c-f089-485e-a63a-85a0852349da")
    public void setPaStep_ModelElement_extOpDemand(final List<String> values) {
        this.elt.putTagValues(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'PaStep_ModelElement_noSync'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e292981a-70e5-4fa3-bd8c-ed168796e140")
    public void setPaStep_ModelElement_noSync(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(PaStepModelElement.MdaTypes.PASTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT);
    }

    @objid ("32b31816-508e-4bbb-875b-10f5ace001f8")
    protected PaStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("115ce582-aa4e-4719-87e9-aff54fe4e6d5")
    public static final class MdaTypes {
        @objid ("40245a33-c5f1-421b-8940-f5dda9c9783a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a778321d-f118-4b9e-b33a-739f768a1414")
        public static TagType PASTEP_MODELELEMENT_NOSYNC_TAGTYPE_ELT;

        @objid ("a3363dd8-55fd-4137-a442-f315454763c4")
        public static TagType PASTEP_MODELELEMENT_EXTOPDEMAND_TAGTYPE_ELT;

        @objid ("1eefabb5-909d-4df0-a204-4f657fbe8aa2")
        public static TagType PASTEP_MODELELEMENT_EXTOPCOUNT_TAGTYPE_ELT;

        @objid ("9a866f4f-bd7f-4efe-93ba-f6d49ba4cde1")
        public static TagType PASTEP_MODELELEMENT_BEHAVDEMAND_TAGTYPE_ELT;

        @objid ("a3b282b8-bb54-4520-bcc6-6e171a05767d")
        public static TagType PASTEP_MODELELEMENT_BEHAVCOUNT_TAGTYPE_ELT;

        @objid ("2850ec80-09a7-4708-b0cc-27d8d76c0d24")
        private static Stereotype MDAASSOCDEP;

        @objid ("94b1cfd1-b062-44e1-9675-0ee3dd5b8b84")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4ee02b54-e5d9-4d48-ae9a-dc85b1332c9c")
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
