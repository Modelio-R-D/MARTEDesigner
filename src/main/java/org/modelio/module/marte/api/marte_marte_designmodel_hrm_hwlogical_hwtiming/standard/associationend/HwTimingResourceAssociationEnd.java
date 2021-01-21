/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.associationend;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.TimingResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwTimingResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b7f6c673-08b1-4345-bd13-fa36d452c499")
public class HwTimingResourceAssociationEnd extends TimingResourceAssociationEnd {
    @objid ("7a16e0eb-bf64-44c0-a0c6-317b3908bd07")
    public static final String STEREOTYPE_NAME = "HwTimingResource_AssociationEnd";

    @objid ("fc256e44-a2e7-487f-ab85-964a3970979e")
    public static final String HWTIMINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE = "HwTimingResource_AssociationEnd_description";

    @objid ("ec4f6a7d-7e7e-42ae-926d-687008cb2eaa")
    public static final String HWTIMINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE = "HwTimingResource_AssociationEnd_endPoints";

    @objid ("51c2a7c7-d855-4196-bf15-4c35f841a074")
    public static final String HWTIMINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwTimingResource_AssociationEnd_frequency";

    @objid ("81b21f06-f1c4-4424-b6ef-794a8e1fb02d")
    public static final String HWTIMINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE = "HwTimingResource_AssociationEnd_ownedHW";

    @objid ("710a6229-112e-4cbb-9302-30894c6686df")
    public static final String HWTIMINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE = "HwTimingResource_AssociationEnd_p_HW_Services";

    @objid ("94fba210-21b0-4c5f-8270-6260f4b814b4")
    public static final String HWTIMINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE = "HwTimingResource_AssociationEnd_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwTimingResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bdd1d4dd-f44f-41f3-b6a0-d5960b68bda4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwTimingResource_AssociationEnd >> then instantiate a {@link HwTimingResourceAssociationEnd} proxy.
     * 
     * @return a {@link HwTimingResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("b57791b6-b53a-49a8-9ebb-21bbaa182b8e")
    public static HwTimingResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceAssociationEnd.STEREOTYPE_NAME);
        return HwTimingResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwTimingResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwTimingResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("29434258-453f-403e-9e17-ff55acc0c504")
    public static HwTimingResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return HwTimingResourceAssociationEnd.canInstantiate(obj) ? new HwTimingResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwTimingResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwTimingResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ad3a6e25-e925-4456-8b95-01618b3b3e90")
    public static HwTimingResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwTimingResourceAssociationEnd.canInstantiate(obj))
        	return new HwTimingResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("75e66043-e8b7-465b-a754-70251ef7248d")
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
        HwTimingResourceAssociationEnd other = (HwTimingResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("78bf0005-420c-477f-ba0a-79de518fe2a2")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7898d4c0-ad4a-4ba5-9f01-48c5a2ea9e60")
    public String getHwTimingResource_AssociationEnd_description() {
        return this.elt.getTagValue(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_AssociationEnd_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c7f403f6-82c8-4327-939e-0eaf1799884d")
    public List<String> getHwTimingResource_AssociationEnd_endPoints() {
        return this.elt.getTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e4fa524f-5ecf-44e3-9c79-f1fa2bc733d8")
    public String getHwTimingResource_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_AssociationEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("934b6925-6f4f-4cd8-8250-999c6f3c1492")
    public List<String> getHwTimingResource_AssociationEnd_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_AssociationEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fdf32875-fbe9-420f-a84a-79877afdcfad")
    public List<String> getHwTimingResource_AssociationEnd_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_AssociationEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8bc21894-5cc4-42f0-b870-8485d80c028a")
    public List<String> getHwTimingResource_AssociationEnd_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("0b01becc-3c44-47b1-b530-9d88202e2f28")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("87716a29-2c0a-4ba5-8269-a3f626f51cdf")
    public void setHwTimingResource_AssociationEnd_description(final String value) {
        this.elt.putTagValue(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_AssociationEnd_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3bfff1e1-e1b6-4521-ac68-f081ad858ebb")
    public void setHwTimingResource_AssociationEnd_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6009240e-b1c9-43a3-b25a-06ac19cff4d8")
    public void setHwTimingResource_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_AssociationEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8ea5a7a7-a7a7-4f89-a2fe-4f5608ee888a")
    public void setHwTimingResource_AssociationEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_AssociationEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fb0a4f37-c1c6-4e11-b042-53168d852358")
    public void setHwTimingResource_AssociationEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_AssociationEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3ff85c19-4bce-463c-b99f-2d5f3dabbe69")
    public void setHwTimingResource_AssociationEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociationEnd.MdaTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("514eab0d-3026-4afa-b9bb-dbc73792c2f0")
    protected HwTimingResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("68cb1f2b-b396-493e-af11-d06fea3b6f98")
    public static final class MdaTypes {
        @objid ("e76ee4a9-c505-4aec-b6dd-805a5899df2c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4531d00d-2882-4b24-a04e-d843088591e3")
        public static TagType HWTIMINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT;

        @objid ("1203316e-77be-492f-b22d-f1599bb8b0de")
        public static TagType HWTIMINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("5a9f8a33-2922-4757-8d7f-bde53fe4e8e4")
        public static TagType HWTIMINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("a39be5c5-d19d-46db-8048-6a321cb74e4b")
        public static TagType HWTIMINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT;

        @objid ("56cf9e94-9a4a-4b18-83f4-89bb93185334")
        public static TagType HWTIMINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT;

        @objid ("db3a40a1-d2b2-4fd3-b853-0a6f49dbcefd")
        public static TagType HWTIMINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        @objid ("cead9c93-a5aa-40ad-9890-cb92d1da6b0a")
        private static Stereotype MDAASSOCDEP;

        @objid ("ec158c20-d8b7-4bbe-be6e-299c6642da35")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("07cbe6cc-6b3d-443c-9be9-802fd811e8a2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01226911-0ccf-11df-8525-001302895b2b");
            HWTIMINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e1228e3-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e1228e4-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e1228e5-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e1228e6-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e1228e8-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6a8c32f2-8dfb-11e0-8741-0027103f347c");
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
