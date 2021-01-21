/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.infrastructure.modelelement;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << SaEndtoEndFlow_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6bba1f76-003e-4a41-bf11-2e226c0d1cfe")
public class SaEndtoEndFlowModelElement {
    @objid ("6f425a12-6f19-46e9-95b3-26f7ee19c095")
    public static final String STEREOTYPE_NAME = "SaEndtoEndFlow_ModelElement";

    @objid ("13b07a19-1989-44ee-9796-9c38835b3487")
    public static final String SAENDTOENDFLOW_MODELELEMENT_ENDTOENDD_TAGTYPE = "SaEndtoEndFlow_ModelElement_endToEndD";

    @objid ("9ea15379-158e-474f-8514-fe3e3df17e33")
    public static final String SAENDTOENDFLOW_MODELELEMENT_ENDTOENDT_TAGTYPE = "SaEndtoEndFlow_ModelElement_endToEndT";

    @objid ("8c93ce76-adeb-4ff2-884d-8e5c0f5499ce")
    public static final String SAENDTOENDFLOW_MODELELEMENT_ISSCHED_TAGTYPE = "SaEndtoEndFlow_ModelElement_isSched";

    @objid ("81cb41c1-1d7a-4036-beff-8a101aeaeaa8")
    public static final String SAENDTOENDFLOW_MODELELEMENT_SCHSLACK_TAGTYPE = "SaEndtoEndFlow_ModelElement_schSlack";

    @objid ("78978609-cdcd-4ebf-9d61-86ca0f50b447")
    public static final String SAENDTOENDFLOW_MODELELEMENT_TIMING_TAGTYPE = "SaEndtoEndFlow_ModelElement_timing";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("7aa87f90-8d47-48e9-8e4a-195cfb291518")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link SaEndtoEndFlowModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << SaEndtoEndFlow_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c11a95f9-4a52-44a8-9b22-bdc96cd6b938")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaEndtoEndFlowModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << SaEndtoEndFlow_ModelElement >> then instantiate a {@link SaEndtoEndFlowModelElement} proxy.
     * 
     * @return a {@link SaEndtoEndFlowModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("d3f1933c-7025-490a-b84a-64f33c3e6eb3")
    public static SaEndtoEndFlowModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaEndtoEndFlowModelElement.STEREOTYPE_NAME);
        return SaEndtoEndFlowModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link SaEndtoEndFlowModelElement} proxy from a {@link ModelElement} stereotyped << SaEndtoEndFlow_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link SaEndtoEndFlowModelElement} proxy or <i>null</i>.
     */
    @objid ("1c5a7d43-ec82-4ee4-9110-ee2b7b7c4820")
    public static SaEndtoEndFlowModelElement instantiate(final ModelElement obj) {
        return SaEndtoEndFlowModelElement.canInstantiate(obj) ? new SaEndtoEndFlowModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaEndtoEndFlowModelElement} proxy from a {@link ModelElement} stereotyped << SaEndtoEndFlow_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link SaEndtoEndFlowModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3e5f3340-2568-4093-9839-a680ea9f4113")
    public static SaEndtoEndFlowModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (SaEndtoEndFlowModelElement.canInstantiate(obj))
        	return new SaEndtoEndFlowModelElement(obj);
        else
        	throw new IllegalArgumentException("SaEndtoEndFlowModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6aeb38ce-428f-40b5-95aa-13a70f092d37")
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
        SaEndtoEndFlowModelElement other = (SaEndtoEndFlowModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("66d8dff6-1341-4b63-b01c-84a22bddccd0")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for List<String> property 'SaEndtoEndFlow_ModelElement_endToEndD'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8a8b14b5-b929-4245-b920-7193ff3f22bf")
    public List<String> getSaEndtoEndFlow_ModelElement_endToEndD() {
        return this.elt.getTagValues(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ENDTOENDD_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaEndtoEndFlow_ModelElement_endToEndT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f6e5f963-3e66-41c3-bafc-a4da9a36f5f5")
    public List<String> getSaEndtoEndFlow_ModelElement_endToEndT() {
        return this.elt.getTagValues(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ENDTOENDT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaEndtoEndFlow_ModelElement_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("592be051-c2eb-421d-a1b9-548ba5fcdc3a")
    public String getSaEndtoEndFlow_ModelElement_schSlack() {
        return this.elt.getTagValue(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaEndtoEndFlow_ModelElement_timing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("de05078d-af34-44b4-ab3c-88964af5f811")
    public List<String> getSaEndtoEndFlow_ModelElement_timing() {
        return this.elt.getTagValues(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_TIMING_TAGTYPE_ELT);
    }

    @objid ("dc242242-f1d7-4dfe-8d9e-085d092dc2aa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaEndtoEndFlow_ModelElement_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ad044d6-7070-444e-aa31-87b2f3ddd1b7")
    public boolean isSaEndtoEndFlow_ModelElement_isSched() {
        return this.elt.isTagged(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaEndtoEndFlow_ModelElement_endToEndD'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6bf436df-0dd7-4cee-8fd6-860cdc09d13a")
    public void setSaEndtoEndFlow_ModelElement_endToEndD(final List<String> values) {
        this.elt.putTagValues(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ENDTOENDD_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SaEndtoEndFlow_ModelElement_endToEndT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b7cae516-83c8-4ab9-99a5-9811d472bd27")
    public void setSaEndtoEndFlow_ModelElement_endToEndT(final List<String> values) {
        this.elt.putTagValues(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ENDTOENDT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'SaEndtoEndFlow_ModelElement_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fb6b50b7-ab5c-4f03-a4d9-2903b63cd061")
    public void setSaEndtoEndFlow_ModelElement_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaEndtoEndFlow_ModelElement_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6c45572-fc12-4b4b-bb7b-e95804e94647")
    public void setSaEndtoEndFlow_ModelElement_schSlack(final String value) {
        this.elt.putTagValue(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SaEndtoEndFlow_ModelElement_timing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd923a61-dd50-4f01-849d-789fa61dcf3f")
    public void setSaEndtoEndFlow_ModelElement_timing(final List<String> values) {
        this.elt.putTagValues(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_TIMING_TAGTYPE_ELT, values);
    }

    @objid ("32da4e74-7ad5-4bb6-a1c2-f6155e565d40")
    protected SaEndtoEndFlowModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("5d2f0e13-f922-4db5-98b2-feca4f4eb739")
    public static final class MdaTypes {
        @objid ("f71b8b3b-6749-49a0-b804-4efa1919ce94")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("637db3c4-afe3-4e10-a40d-fa5296d00a4a")
        public static TagType SAENDTOENDFLOW_MODELELEMENT_ISSCHED_TAGTYPE_ELT;

        @objid ("d1905606-bfb8-4b16-9589-863e293de882")
        public static TagType SAENDTOENDFLOW_MODELELEMENT_SCHSLACK_TAGTYPE_ELT;

        @objid ("03ba9daa-f727-4e29-9df8-aff478cdf6ab")
        public static TagType SAENDTOENDFLOW_MODELELEMENT_ENDTOENDT_TAGTYPE_ELT;

        @objid ("d582afb7-ddb6-4469-93f4-4bc355a10f70")
        public static TagType SAENDTOENDFLOW_MODELELEMENT_ENDTOENDD_TAGTYPE_ELT;

        @objid ("0f095000-d13f-4f3e-b946-d1257ac9cf0c")
        public static TagType SAENDTOENDFLOW_MODELELEMENT_TIMING_TAGTYPE_ELT;

        @objid ("c1584bcb-529d-4733-ba47-b00f7810dfbc")
        private static Stereotype MDAASSOCDEP;

        @objid ("6cc7fc3f-1fc0-4352-86c2-b83aca5d8625")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("97239d06-55be-47be-bfff-5ad6d89b0465")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0384bb16-0ccf-11df-8525-001302895b2b");
            SAENDTOENDFLOW_MODELELEMENT_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb17-0ccf-11df-8525-001302895b2b");
            SAENDTOENDFLOW_MODELELEMENT_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb18-0ccf-11df-8525-001302895b2b");
            SAENDTOENDFLOW_MODELELEMENT_ENDTOENDT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb19-0ccf-11df-8525-001302895b2b");
            SAENDTOENDFLOW_MODELELEMENT_ENDTOENDD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb1a-0ccf-11df-8525-001302895b2b");
            SAENDTOENDFLOW_MODELELEMENT_TIMING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb1b-0ccf-11df-8525-001302895b2b");
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
