/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ComputingResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwComputingResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ac34a65a-6d9c-493e-9a1b-12c6141f3834")
public class HwComputingResourceInstance extends ComputingResourceInstance {
    @objid ("b004332d-7a50-4a98-810d-c92e8af731bf")
    public static final String STEREOTYPE_NAME = "HwComputingResource_Instance";

    @objid ("1ab4358a-ad6e-4d38-95f6-fc699a8b9294")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE = "HwComputingResource_Instance_description";

    @objid ("5a39855b-a1fe-4026-941a-c7cc162c96c0")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE = "HwComputingResource_Instance_endPoints";

    @objid ("b26ab19d-3496-46a0-9be5-f04225e09f06")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE = "HwComputingResource_Instance_frequency";

    @objid ("ae7b53b7-443a-4e9f-b868-c3dc9ba923bd")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_Instance_op_Frequencies";

    @objid ("101b95a0-7e44-4179-b793-c86ee1800b34")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE = "HwComputingResource_Instance_ownedHW";

    @objid ("ccc10864-1340-4ca5-a5e4-499574d91796")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE = "HwComputingResource_Instance_p_HW_Services";

    @objid ("0c2d5d8a-ff9d-4709-a8d4-3620701f4a35")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE = "HwComputingResource_Instance_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwComputingResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9860b873-3c1f-449b-b14a-8b8970cb9b26")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwComputingResource_Instance >> then instantiate a {@link HwComputingResourceInstance} proxy.
     * 
     * @return a {@link HwComputingResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("2dcbb898-94ed-4a8a-aa45-401e8bf8ef0f")
    public static HwComputingResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceInstance.STEREOTYPE_NAME);
        return HwComputingResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceInstance} proxy from a {@link Instance} stereotyped << HwComputingResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwComputingResourceInstance} proxy or <i>null</i>.
     */
    @objid ("d8576caa-7f14-47b6-9fae-bde0215c35ca")
    public static HwComputingResourceInstance instantiate(final Instance obj) {
        return HwComputingResourceInstance.canInstantiate(obj) ? new HwComputingResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceInstance} proxy from a {@link Instance} stereotyped << HwComputingResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwComputingResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b380d63d-aed0-49ae-83a6-522c3d3eef16")
    public static HwComputingResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwComputingResourceInstance.canInstantiate(obj))
        	return new HwComputingResourceInstance(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5fca8c79-3376-4af4-84b1-9bfe4ddf9e25")
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
        HwComputingResourceInstance other = (HwComputingResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("7c51abdd-abc5-43dd-8edc-afb61f123720")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d930411-e3ca-491e-b6fd-0f3e96c4494e")
    public String getHwComputingResource_Instance_description() {
        return this.elt.getTagValue(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Instance_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d6e45d6f-5b7a-4d03-8956-40d86842d92f")
    public List<String> getHwComputingResource_Instance_endPoints() {
        return this.elt.getTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b922f84-de36-4d99-8759-fafd9fa55bc8")
    public String getHwComputingResource_Instance_frequency() {
        return this.elt.getTagValue(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Instance_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b64863bc-44f8-4483-8d97-e6072769957d")
    public String getHwComputingResource_Instance_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Instance_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d2d4f49b-cb05-4dd5-92e7-65884bb52ff4")
    public List<String> getHwComputingResource_Instance_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Instance_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1c9c0595-9508-4ba2-8a76-96dae7962431")
    public List<String> getHwComputingResource_Instance_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Instance_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1101e59d-7f8c-4eeb-8c8f-6988c990d90a")
    public List<String> getHwComputingResource_Instance_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("733c41c7-614a-49a7-8b15-4a7d86db651d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e944ed3-9677-4dbb-8bdf-381a9a2acfdb")
    public void setHwComputingResource_Instance_description(final String value) {
        this.elt.putTagValue(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Instance_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("647af3db-add3-4958-a0a4-aac75ce3d8ca")
    public void setHwComputingResource_Instance_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8d2d29f9-ccac-4b4b-8ef4-f7966689f5b9")
    public void setHwComputingResource_Instance_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_Instance_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dbb3d7bb-75e4-420a-b105-1692696a0e4f")
    public void setHwComputingResource_Instance_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Instance_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e9b9c7d2-fcb4-4ed5-b12b-5e4b0243ed91")
    public void setHwComputingResource_Instance_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Instance_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f29a30c6-64bf-4c75-b1a0-25797a3d8a0c")
    public void setHwComputingResource_Instance_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Instance_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c4f31e3-0c69-4ca0-8398-b610c413b25e")
    public void setHwComputingResource_Instance_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("4ebb7fc6-655f-4ad3-86ea-a738f12340bf")
    protected HwComputingResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("952041e6-8ff0-4e97-b4b8-edf38dd557e1")
    public static final class MdaTypes {
        @objid ("6f7e6016-d4d2-472d-a47b-8a937ca6a685")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e0d17bb7-fda6-4d78-b962-349ae90293cd")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES_TAGTYPE_ELT;

        @objid ("cfdd749e-7983-4a5c-941b-fd8b8484a407")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("bcf773ef-f3f0-4692-91ec-42de1162c370")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("24de728b-d8e9-4f46-95b2-a882cf33c043")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("839834a7-850e-4763-ba60-a66af2d00713")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT;

        @objid ("134ee8c8-b81d-49fc-8fb6-d384c56c596d")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT;

        @objid ("aeb6bec1-74e3-49ba-b0d2-ef6e4d82866f")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("0ee2c35b-ddb6-45bb-a3eb-ab220a1df8ae")
        private static Stereotype MDAASSOCDEP;

        @objid ("95c6baa6-719c-4404-abd5-3b0529ed9a6b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c737095d-6c32-46c6-b3ed-29df6a4f191c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00d61ed6-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00e46cc2-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3d13fafb-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3d13fafc-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3d13fafd-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3d13fafe-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3d13faff-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3d13fb00-1623-11df-b9be-0014222a9f79");
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
