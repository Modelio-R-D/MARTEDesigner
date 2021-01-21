/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ComputingResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwComputingResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a8821de4-a8e7-4060-92b0-2393b98f1ed1")
public class HwComputingResourceAssociation extends ComputingResourceAssociation {
    @objid ("25c92d2e-240e-4cc3-b193-ccb76d9df186")
    public static final String STEREOTYPE_NAME = "HwComputingResource_Association";

    @objid ("12a2e2b8-ec5e-4d1b-90bc-f1ff9ffca802")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwComputingResource_Association_description";

    @objid ("b1a25c6a-eb5c-45a8-8151-add764998d9f")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE = "HwComputingResource_Association_endPoints";

    @objid ("02d3c510-bc9f-4fa9-8f48-32a0c7e61fe5")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE = "HwComputingResource_Association_frequency";

    @objid ("27043d73-9588-4767-9c41-3838d9f541d3")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_Association_op_Frequencies";

    @objid ("9a52e332-c735-483d-b311-8759dadf67eb")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE = "HwComputingResource_Association_ownedHW";

    @objid ("a964b569-89ff-42dc-adb1-f4a43e9372a5")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwComputingResource_Association_p_HW_Services";

    @objid ("d04f1b78-15ae-4a74-8222-11117ecdb265")
    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwComputingResource_Association_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwComputingResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ff8b0d2c-9210-4454-ae81-2f728e7fb672")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwComputingResource_Association >> then instantiate a {@link HwComputingResourceAssociation} proxy.
     * 
     * @return a {@link HwComputingResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("2becd08a-886d-4aa3-8aa7-61086c990b2f")
    public static HwComputingResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAssociation.STEREOTYPE_NAME);
        return HwComputingResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceAssociation} proxy from a {@link Association} stereotyped << HwComputingResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwComputingResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("5d547471-3831-4197-a707-468d35874a9c")
    public static HwComputingResourceAssociation instantiate(final Association obj) {
        return HwComputingResourceAssociation.canInstantiate(obj) ? new HwComputingResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceAssociation} proxy from a {@link Association} stereotyped << HwComputingResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwComputingResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("347dc4f1-355c-4e36-8f8a-cffa7fadf1cf")
    public static HwComputingResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwComputingResourceAssociation.canInstantiate(obj))
        	return new HwComputingResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bdc68c8c-78af-4cf1-8c4c-1949ef1570c7")
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
        HwComputingResourceAssociation other = (HwComputingResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("9b2361de-dbc7-41ec-8a35-0e675cb6914f")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("742d6750-f3c6-4f03-824d-b3ae7655bce7")
    public String getHwComputingResource_Association_description() {
        return this.elt.getTagValue(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Association_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cc6c427c-207b-426a-9a74-a845f27e91f0")
    public List<String> getHwComputingResource_Association_endPoints() {
        return this.elt.getTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30d4e5a3-64b1-4f0f-8867-44bfbb72f570")
    public String getHwComputingResource_Association_frequency() {
        return this.elt.getTagValue(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Association_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5bae57c5-b102-498f-a3f7-e70fc0b5e81a")
    public String getHwComputingResource_Association_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9e16174b-5481-4213-ba87-2949a2403443")
    public List<String> getHwComputingResource_Association_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2e1ac030-a78f-4c3c-9173-495a9afcf200")
    public List<String> getHwComputingResource_Association_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ce4ff3c3-9451-4774-a835-cec020cfd844")
    public List<String> getHwComputingResource_Association_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("4ebb849a-27cf-4307-a28c-dd27e0dde11c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a9de9b45-d0dd-4202-b390-79bf2334ac2a")
    public void setHwComputingResource_Association_description(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Association_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5ef30697-a0c7-4b6b-bc27-aeb62f64bcb3")
    public void setHwComputingResource_Association_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c0a340c5-4fb7-4dbe-b42f-e9d74f68e8f2")
    public void setHwComputingResource_Association_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_Association_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("004bf5b6-67de-4af7-ad78-3e7244716623")
    public void setHwComputingResource_Association_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e308be41-db60-4e3f-979c-7e49bf31be01")
    public void setHwComputingResource_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1624cf0-bf9a-400c-b613-de87cec39069")
    public void setHwComputingResource_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9af8cd44-c4f9-4aec-9466-5877185eb069")
    public void setHwComputingResource_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("30240cc6-7a62-43a5-8406-ee762c011587")
    protected HwComputingResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("dff2c84e-96a1-4936-aeeb-ccf79b1c19cf")
    public static final class MdaTypes {
        @objid ("33a78df1-7d79-4140-87c2-2fd890630b42")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b93e118d-5f26-4441-81d8-4e329a818a1c")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES_TAGTYPE_ELT;

        @objid ("e78f7621-6396-46d9-afe0-671060523b5a")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        @objid ("1ee10d23-f65f-4f99-9c8c-2897e4c9991a")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("d1fbe685-8849-4c42-8bc9-dc2fe7058f9c")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("8e1fddad-2842-4d78-9c0e-69cb5a890da4")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        @objid ("1d6b2b96-c955-4302-982f-6f5c7b953600")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        @objid ("fef39c47-2794-4f0f-af34-255dbe8c0db5")
        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT;

        @objid ("762a0b00-7377-463e-8225-defe106c0965")
        private static Stereotype MDAASSOCDEP;

        @objid ("fe7ff27a-8508-4a14-8e64-d592c6607806")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aae918f6-6727-4d33-8586-b797ba0c5d9d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6e135f18-10a4-11df-81d9-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6e135f19-10a4-11df-81d9-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ae4b2f9-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ae4b2fa-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ae4b2fb-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ae4b2fc-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ae4b2fd-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ae4b2fe-1623-11df-b9be-0014222a9f79");
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
