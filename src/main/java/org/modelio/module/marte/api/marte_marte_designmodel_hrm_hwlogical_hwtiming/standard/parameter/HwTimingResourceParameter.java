/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.TimingResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwTimingResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4fc78816-fa33-4d32-b1a1-6ed58226f29c")
public class HwTimingResourceParameter extends TimingResourceParameter {
    @objid ("b540721b-3d1b-4727-a06f-92169592b3cd")
    public static final String STEREOTYPE_NAME = "HwTimingResource_Parameter";

    @objid ("37771dcb-c7a4-4a3b-bc92-3106e7682891")
    public static final String HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE = "HwTimingResource_Parameter_description";

    @objid ("a16397e2-efb4-4198-bc59-79a7d89d5fe5")
    public static final String HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE = "HwTimingResource_Parameter_endPoints";

    @objid ("f0fa28c7-dd96-4214-8f4a-e1ca1436b008")
    public static final String HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE = "HwTimingResource_Parameter_frequency";

    @objid ("0e7a2d23-c68b-4578-905f-6e5165b062a5")
    public static final String HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE = "HwTimingResource_Parameter_ownedHW";

    @objid ("0adfcdfc-473d-4163-ae58-7a990632d000")
    public static final String HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Parameter_p_HW_Services";

    @objid ("2b3f74e1-40ef-491e-bf0d-14e6812f4460")
    public static final String HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Parameter_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwTimingResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ce985a3a-90f1-489a-b997-ec9964753260")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwTimingResource_Parameter >> then instantiate a {@link HwTimingResourceParameter} proxy.
     * 
     * @return a {@link HwTimingResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("61c29e65-b578-4e8a-b06f-250bf0b4fcd0")
    public static HwTimingResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceParameter.STEREOTYPE_NAME);
        return HwTimingResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceParameter} proxy from a {@link Parameter} stereotyped << HwTimingResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwTimingResourceParameter} proxy or <i>null</i>.
     */
    @objid ("e880fdce-7b68-46eb-9e4f-22e4d33a982b")
    public static HwTimingResourceParameter instantiate(final Parameter obj) {
        return HwTimingResourceParameter.canInstantiate(obj) ? new HwTimingResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceParameter} proxy from a {@link Parameter} stereotyped << HwTimingResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwTimingResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e12e54aa-07c6-4ac9-b33a-2dbd78417119")
    public static HwTimingResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwTimingResourceParameter.canInstantiate(obj))
        	return new HwTimingResourceParameter(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("97bb85ed-b47a-4d60-8484-4ac4855f29f4")
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
        HwTimingResourceParameter other = (HwTimingResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("6fd972cc-711a-451a-8b4e-cf90c001c233")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("946c6d96-4215-4353-aa39-a00a0fa45c5e")
    public String getHwTimingResource_Parameter_description() {
        return this.elt.getTagValue(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Parameter_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8e0ca99a-927a-4210-a106-90f7dd306cf2")
    public List<String> getHwTimingResource_Parameter_endPoints() {
        return this.elt.getTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d4eb760-be04-48fa-8158-8244372c71c1")
    public String getHwTimingResource_Parameter_frequency() {
        return this.elt.getTagValue(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Parameter_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9cd936c2-1e4d-4d25-8dea-a3d680e2a608")
    public List<String> getHwTimingResource_Parameter_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Parameter_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("23d254dc-1e6e-4496-91dd-0a7e95e71ee3")
    public List<String> getHwTimingResource_Parameter_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Parameter_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("21b72a35-730b-4540-8db8-d3f8005489cb")
    public List<String> getHwTimingResource_Parameter_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("b1f60f19-434d-4a0c-beff-59f27fe55b83")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d9c34dd2-25ec-4d11-a37e-367876d23dc6")
    public void setHwTimingResource_Parameter_description(final String value) {
        this.elt.putTagValue(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Parameter_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5279bacb-9def-45be-afe0-72d4e175a6f0")
    public void setHwTimingResource_Parameter_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("87ca8540-f39e-44f7-95ee-8248ecd46e01")
    public void setHwTimingResource_Parameter_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Parameter_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aef64daa-8ab6-48ea-bcc4-d5849a7bd02e")
    public void setHwTimingResource_Parameter_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Parameter_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b40a7bef-6957-4a21-8841-3b12e7c82714")
    public void setHwTimingResource_Parameter_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Parameter_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("faaa8218-146a-40b3-8706-151426cf540e")
    public void setHwTimingResource_Parameter_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("2dbaaba8-4f29-47d1-9b3a-e4195a874aba")
    protected HwTimingResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("429927ba-d276-45ce-91e0-da4a4c21192e")
    public static final class MdaTypes {
        @objid ("b8d979d8-25e3-4b7e-8591-ba360699b4de")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("346b2820-4acf-416f-8e71-ebe9b8e71557")
        public static TagType HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("7f8f31fa-05ee-4232-b829-6e321fe798e4")
        public static TagType HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("b1695e19-18cc-4eac-be71-2422dafe332e")
        public static TagType HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("03d7daf0-6815-4312-af38-58961e73727e")
        public static TagType HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT;

        @objid ("cac5c9f4-f118-4329-a404-c72ab702338b")
        public static TagType HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("c54d26ad-c597-4ad2-a15b-b160cb735c1c")
        public static TagType HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT;

        @objid ("14db71a9-70a8-452d-ab89-6753c7395c4d")
        private static Stereotype MDAASSOCDEP;

        @objid ("9be1a26a-2d6f-46d2-9a24-413a3fbfd1f8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("24d3e55f-2b14-40d0-8aaa-e5a29343dcbf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01226910-0ccf-11df-8525-001302895b2b");
            HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "43f28866-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "43f28867-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "43f28868-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "43f28869-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b9e86900-1709-11df-b92a-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "703fd91f-8dfb-11e0-8741-0027103f347c");
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
