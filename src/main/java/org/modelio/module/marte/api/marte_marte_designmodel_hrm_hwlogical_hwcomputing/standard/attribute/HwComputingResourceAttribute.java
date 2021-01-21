/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ComputingResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwComputingResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dea84919-bfae-4284-bc65-660fcf8a7204")
public class HwComputingResourceAttribute extends ComputingResourceAttribute {
    @objid ("323b7e8d-4036-4bd0-ad5b-b723c9efab96")
    public static final String STEREOTYPE_NAME = "HwComputingResource_Attribute";

    @objid ("041d4790-c139-42fa-a965-795346bb012d")
    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE = "HwComputingResource_Attribute_description";

    @objid ("236eb458-df77-411d-8c78-ba573dd1efae")
    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE = "HwComputingResource_Attribute_endPoints";

    @objid ("ca3d39b6-cb14-43e2-ae77-ac2ab4c55049")
    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE = "HwComputingResource_Attribute_frequency";

    @objid ("05e259a2-bf94-4fd6-a408-368c474a7458")
    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_Attribute_op_Frequencies";

    @objid ("eaf9e328-20a1-41de-b624-22b14472149f")
    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE = "HwComputingResource_Attribute_ownedHW";

    @objid ("f2c5cfc8-ad17-4aed-b7fa-a7f45484f6a9")
    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE = "HwComputingResource_Attribute_p_HW_Services";

    @objid ("757c2f41-d971-4f37-998a-7505e51b17e3")
    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE = "HwComputingResource_Attribute_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwComputingResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("21895925-6200-4a75-accd-b72ccd198f8f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwComputingResource_Attribute >> then instantiate a {@link HwComputingResourceAttribute} proxy.
     * 
     * @return a {@link HwComputingResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("5fab1a76-0a3d-4f8c-afc7-6271316961a8")
    public static HwComputingResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAttribute.STEREOTYPE_NAME);
        return HwComputingResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceAttribute} proxy from a {@link Attribute} stereotyped << HwComputingResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwComputingResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("07819712-08d0-47d3-a0ad-56810f4391b8")
    public static HwComputingResourceAttribute instantiate(final Attribute obj) {
        return HwComputingResourceAttribute.canInstantiate(obj) ? new HwComputingResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceAttribute} proxy from a {@link Attribute} stereotyped << HwComputingResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwComputingResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c703a6a3-4a74-46d1-baff-beec7e5230d6")
    public static HwComputingResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwComputingResourceAttribute.canInstantiate(obj))
        	return new HwComputingResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0c6cde72-3d50-46c2-ab73-7fd12b9ebd85")
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
        HwComputingResourceAttribute other = (HwComputingResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("8d2f61ec-2386-4d90-be3f-0def1a1d1dc1")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09c52306-86e8-4706-808d-265276b9e750")
    public String getHwComputingResource_Attribute_description() {
        return this.elt.getTagValue(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Attribute_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1b1d68b6-a222-49ff-af72-47e3403efb93")
    public List<String> getHwComputingResource_Attribute_endPoints() {
        return this.elt.getTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b2e9ab6-b25d-4228-8f06-6522b7acdf63")
    public String getHwComputingResource_Attribute_frequency() {
        return this.elt.getTagValue(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Attribute_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da7b0e74-757c-4722-9b07-9bfd127f5cc8")
    public String getHwComputingResource_Attribute_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Attribute_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("573ec982-0b1f-4e7e-9d34-671d77c011af")
    public List<String> getHwComputingResource_Attribute_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Attribute_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6a2c90f3-82c9-4ab3-9772-423b8e4fb68c")
    public List<String> getHwComputingResource_Attribute_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Attribute_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0dc759b0-b53b-486d-a602-cd048ef5e050")
    public List<String> getHwComputingResource_Attribute_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("ed14fab9-5762-43ce-bf3e-c26e25e77c5d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f4d29fee-5f26-4462-a8f6-d2321f60bfd8")
    public void setHwComputingResource_Attribute_description(final String value) {
        this.elt.putTagValue(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Attribute_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("95700ea3-bb5d-4c76-8261-4fb2d93c8ca5")
    public void setHwComputingResource_Attribute_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("898637aa-9d7f-4f11-b1d9-380e25e0d590")
    public void setHwComputingResource_Attribute_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_Attribute_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5804fbf4-5e78-408a-9d2a-298ef8992393")
    public void setHwComputingResource_Attribute_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Attribute_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0676ca4f-3aef-4f61-b39e-39a93a2dbd8b")
    public void setHwComputingResource_Attribute_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Attribute_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6d6836b6-4a24-490a-84b9-da6d982ee20f")
    public void setHwComputingResource_Attribute_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Attribute_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("37d64b83-4509-4dd2-8710-4c9bf33c4f16")
    public void setHwComputingResource_Attribute_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("c757c649-c993-4397-995d-175ffa524677")
    protected HwComputingResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("f41ff6bd-632d-4970-8504-796ee0be00b0")
    public static final class MdaTypes {
        @objid ("8e3cddc7-0c41-4c81-a642-1d77bdceaee2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d5da7788-2e9a-405e-b8b9-70f8b373e106")
        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES_TAGTYPE_ELT;

        @objid ("bc31e37f-ec8a-41bf-95d9-41442319e5ef")
        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("b7ebc572-072c-499a-b35c-79ca9566a36d")
        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("17b3c98b-7045-4506-8b05-678469f3b960")
        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("e99ab7a2-4fde-467c-b75c-71b31145c295")
        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT;

        @objid ("b3bb6040-f6b2-4a3c-85ef-61c61bb3bf4a")
        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT;

        @objid ("4e821ba6-1bf3-434f-8fb5-7e9eff3d61b8")
        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("937c242d-2d59-484e-b81e-00443ac26f4c")
        private static Stereotype MDAASSOCDEP;

        @objid ("a2dca9a3-6310-4ca0-8711-b042a894b68b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f6944f6e-04d9-4d0b-a34c-dd9de604c43a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00d61ed3-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00e46cbf-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f9812bd-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f9812be-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f9812bf-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f9812c0-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f9812c1-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f9812c2-1623-11df-b9be-0014222a9f79");
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
