/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ComputingResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwComputingResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("64f39010-8824-43e2-adbe-34559ca0acae")
public class HwComputingResourceAssociationEnd extends ComputingResourceAssociationEnd {
    @objid ("6736c54e-6c5c-4149-9573-3e16de163f1c")
    public static final String STEREOTYPE_NAME = "HwComputingResource_AssociationEnd";

    @objid ("6fc89bb0-82e7-4dd7-ba74-838a602e9c8e")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE = "HwComputingResource_AssociationEnd_description";

    @objid ("d53e7111-cf71-4097-a3c8-deb67d0dd75d")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE = "HwComputingResource_AssociationEnd_endPoints";

    @objid ("4948b7fb-f168-40fa-984e-c2cafc976de2")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwComputingResource_AssociationEnd_frequency";

    @objid ("1114f5e1-7beb-474a-824a-228199a45adf")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_AssociationEnd_op_Frequencies";

    @objid ("a89528b5-0fc8-4585-8abc-ff23c8cc5084")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE = "HwComputingResource_AssociationEnd_ownedHW";

    @objid ("89fd068b-9f37-4448-a96e-0ae02819a97a")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE = "HwComputingResource_AssociationEnd_p_HW_Services";

    @objid ("c2791df8-6a5b-4109-ae91-54606d82311f")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE = "HwComputingResource_AssociationEnd_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwComputingResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2558bd63-c493-4774-9b8b-b117a080d55e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwComputingResource_AssociationEnd >> then instantiate a {@link HwComputingResourceAssociationEnd} proxy.
     * 
     * @return a {@link HwComputingResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("33b4ad22-e0bc-4e64-ada0-96542890016f")
    public static HwComputingResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAssociationEnd.STEREOTYPE_NAME);
        return HwComputingResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwComputingResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwComputingResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("02973f60-c00c-4c74-944a-e9033e122031")
    public static HwComputingResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return HwComputingResourceAssociationEnd.canInstantiate(obj) ? new HwComputingResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwComputingResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwComputingResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a3393888-d3ad-4edf-9d0e-11229099d177")
    public static HwComputingResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwComputingResourceAssociationEnd.canInstantiate(obj))
        	return new HwComputingResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fb3fa1a0-a44a-409d-b2b7-6848990c15a0")
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
        HwComputingResourceAssociationEnd other = (HwComputingResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("359be391-a9db-47f5-bfc1-bf9647168233")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7bdf0872-57d1-41d4-ac32-a28a2854ea39")
    public String getHwComputingResource_AssociationEnd_description() {
        return this.elt.getTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_AssociationEnd_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4217cfbe-f018-49a3-9ac1-fdb4b3e58585")
    public List<String> getHwComputingResource_AssociationEnd_endPoints() {
        return this.elt.getTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9031f8a0-5e23-4aa1-b21c-d5cfea9a1034")
    public String getHwComputingResource_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_AssociationEnd_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("62ca3621-9998-47af-a7eb-a39bd85f6a2e")
    public String getHwComputingResource_AssociationEnd_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_AssociationEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ee569e96-b16e-4206-993f-506aa79ca303")
    public List<String> getHwComputingResource_AssociationEnd_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_AssociationEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ac2a5b37-e98d-418f-a2af-c6cb7be026a0")
    public List<String> getHwComputingResource_AssociationEnd_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_AssociationEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("404265ad-ddc4-493e-a903-87e559177ba4")
    public List<String> getHwComputingResource_AssociationEnd_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("3f06eb98-aa64-4b0a-b0d3-2d4c90038448")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("392e0b0d-2507-4d5d-b9f7-1e519620dce6")
    public void setHwComputingResource_AssociationEnd_description(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_AssociationEnd_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ee6059af-3c84-4f85-a877-a3db1ca1263e")
    public void setHwComputingResource_AssociationEnd_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f00eb4eb-bc70-42ec-be21-4f6409711af7")
    public void setHwComputingResource_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_AssociationEnd_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("517af6d0-b9f8-4d9e-aa7a-c7aaf8c9b0e6")
    public void setHwComputingResource_AssociationEnd_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_AssociationEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c2ca96f-57c9-4489-b582-81f6e3a0e8a2")
    public void setHwComputingResource_AssociationEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_AssociationEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d3741e65-1d3e-4d96-a426-e5893ea86a5c")
    public void setHwComputingResource_AssociationEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_AssociationEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b8892eef-4b11-4ad2-91d6-fbe1b75ae15d")
    public void setHwComputingResource_AssociationEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("ae47b6a5-ed7e-44b7-8f8b-72e840093876")
    protected HwComputingResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("09c819c0-78b9-4b62-9947-43dddc21c860")
    public static final class MdaTypes {
        @objid ("0035856b-76e3-4293-80d2-bdc5d8b19d96")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("de596910-0a91-4926-94ad-10a226afefbb")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE_ELT;

        @objid ("07bf7cbd-e947-41fe-9e2e-53a733378dca")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT;

        @objid ("83f9b981-9b8d-48b3-9523-7a04c7dc0acf")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("6c2b9ba1-8545-4949-9b52-e6047861a343")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("55ab1ebe-b87b-4bc6-a358-9f08dd909127")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT;

        @objid ("b56bdecd-40a8-49bf-acea-579a0e528974")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        @objid ("22d3ab55-10a2-4539-97ea-05ab8b5f7019")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT;

        @objid ("c66d3f98-dd3b-4146-b458-2029c4d47c4b")
        private static Stereotype MDAASSOCDEP;

        @objid ("f06aacf8-15aa-4de6-8c23-2bfd97816122")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("54f53f41-c3b0-4ee0-982c-d36cc742a895")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00d61ed1-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00e46cbd-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b7a0b09-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b7a0b0a-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b7a0b0b-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b7a0b0c-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b7a0b0d-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b7a0b0e-1623-11df-b9be-0014222a9f79");
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
