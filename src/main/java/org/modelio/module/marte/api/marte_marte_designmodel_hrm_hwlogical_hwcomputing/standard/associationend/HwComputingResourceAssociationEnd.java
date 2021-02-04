/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("99819c33-6f2f-486e-88b2-8662c465ccb8")
    public static final String STEREOTYPE_NAME = "HwComputingResource_AssociationEnd";

    @objid ("739d6eea-c934-4a7c-9a8a-8f0c21fe3869")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE = "HwComputingResource_AssociationEnd_description";

    @objid ("266ecddc-85de-4e28-9ede-d91be7bec52b")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE = "HwComputingResource_AssociationEnd_endPoints";

    @objid ("aaedbc67-8094-42e8-a439-f20951d487fa")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwComputingResource_AssociationEnd_frequency";

    @objid ("94168091-5895-4491-8be1-2994da7560f6")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_AssociationEnd_op_Frequencies";

    @objid ("adac73a8-e2d7-44ab-a2e3-45b08031fb1f")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE = "HwComputingResource_AssociationEnd_ownedHW";

    @objid ("614c3511-b79e-4bd1-9727-b4d3123878e1")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE = "HwComputingResource_AssociationEnd_p_HW_Services";

    @objid ("97f6ce78-c419-4c56-9219-b3afafee7241")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE = "HwComputingResource_AssociationEnd_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwComputingResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d7abe1fc-adb8-45b0-8c45-dde8b7c9dcb4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwComputingResource_AssociationEnd >> then instantiate a {@link HwComputingResourceAssociationEnd} proxy.
     * 
     * @return a {@link HwComputingResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("566c2d67-d949-4145-bba6-07d5771204a3")
    public static HwComputingResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAssociationEnd.STEREOTYPE_NAME);
        return HwComputingResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwComputingResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwComputingResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("5b7bbb46-7ff8-45fc-9ace-ccfb06056af1")
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
    @objid ("d0ae5de4-08bc-4395-a1d5-7f36328bd505")
    public static HwComputingResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwComputingResourceAssociationEnd.canInstantiate(obj))
        	return new HwComputingResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("212ee311-64b1-4be5-b111-071aeb07c4f4")
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
    @objid ("863bcfec-4c12-4caf-b0fb-d11244ad62e6")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0619f9f-d198-46d5-b87f-1c072dcc91bc")
    public String getHwComputingResource_AssociationEnd_description() {
        return this.elt.getTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_AssociationEnd_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f983ecdd-1f2f-49ac-b7ba-4fb1b3f7fe41")
    public List<String> getHwComputingResource_AssociationEnd_endPoints() {
        return this.elt.getTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9244c04a-3bca-421b-80aa-e997c5d60e99")
    public String getHwComputingResource_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_AssociationEnd_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d574ffe0-ffa0-45b1-ba86-762cf5cad070")
    public String getHwComputingResource_AssociationEnd_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_AssociationEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e48f9590-7143-4d7d-a5c8-a1fde6503e14")
    public List<String> getHwComputingResource_AssociationEnd_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_AssociationEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("24e0654e-fb96-487f-9649-03f6b6778bc1")
    public List<String> getHwComputingResource_AssociationEnd_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_AssociationEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7620af8f-49dc-4853-8b0d-d963109a4263")
    public List<String> getHwComputingResource_AssociationEnd_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("72296faa-46fb-4d98-904c-f1a985fb0605")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a6a74fb8-241e-4233-a4f3-bde7860f5726")
    public void setHwComputingResource_AssociationEnd_description(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_AssociationEnd_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dfc8bac5-222a-41b9-8f71-afca485ffcce")
    public void setHwComputingResource_AssociationEnd_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("65310fa7-8d8c-42db-aba8-78245e8d4a26")
    public void setHwComputingResource_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_AssociationEnd_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6bc7a6a5-559f-4e81-989f-1e0f3a21d867")
    public void setHwComputingResource_AssociationEnd_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_AssociationEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d954d3f-2306-4b88-89ff-53f10e9dc16f")
    public void setHwComputingResource_AssociationEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_AssociationEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("baf6456b-f3d9-4b02-8d7a-745b86a35b8a")
    public void setHwComputingResource_AssociationEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_AssociationEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a5e64b0-c580-4f80-8a2c-a7841b93eaf4")
    public void setHwComputingResource_AssociationEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("032b00b4-50e2-4dd4-855e-e4d9f43b09d2")
    protected HwComputingResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("09c819c0-78b9-4b62-9947-43dddc21c860")
    public static final class MdaTypes {
        @objid ("6a67ce14-3821-4c72-af63-807578841bb8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0b8f78d9-2ee1-419b-aecf-373a9c41ce84")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE_ELT;

        @objid ("b96748b7-acb1-4c9d-835b-bce188584587")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT;

        @objid ("a77a2a84-e949-456f-8d8b-44951e37ef05")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("0b205022-8fa4-4c76-a9ba-6ba6a3735369")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("1f4180d6-c67c-41af-93ba-8861a191f63c")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT;

        @objid ("f1772dc4-cbd0-413e-8c98-213e703b9505")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        @objid ("990f61e8-dd4e-47f3-b729-5f4d68485c24")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT;

        @objid ("905a74ec-b669-46fc-82c9-36777820254c")
        private static Stereotype MDAASSOCDEP;

        @objid ("4430f59b-c9e8-4502-a343-c94b657612c5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e5dcfbd9-c5ae-487c-b76d-b6f53e23da31")
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
