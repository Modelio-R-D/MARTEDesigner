/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.association;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.TimingResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwTimingResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6e9e4374-f6d5-4eb3-9cbe-e002fbd0014a")
public class HwTimingResourceAssociation extends TimingResourceAssociation {
    @objid ("c39c9119-45e5-44b0-9932-37083f0545c2")
    public static final String STEREOTYPE_NAME = "HwTimingResource_Association";

    @objid ("b0848318-d1b5-4d33-ad9b-7879ce748749")
    public static final String HWTIMINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwTimingResource_Association_description";

    @objid ("28fefc91-b192-4f63-8441-8cba810c6777")
    public static final String HWTIMINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE = "HwTimingResource_Association_endPoints";

    @objid ("f317198c-faef-487a-a8c4-32fac48abfd9")
    public static final String HWTIMINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE = "HwTimingResource_Association_frequency";

    @objid ("b3c89d9d-c9a1-42bb-91c9-8dccba93ce51")
    public static final String HWTIMINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE = "HwTimingResource_Association_ownedHW";

    @objid ("909ea4ea-76a8-465e-b930-44ee0eaeef7b")
    public static final String HWTIMINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Association_p_HW_Services";

    @objid ("ff648b22-bfc8-49d1-a378-4e09a2a9268f")
    public static final String HWTIMINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Association_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwTimingResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("51bfc90e-42d4-485c-8dc9-ee2b6594252b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwTimingResource_Association >> then instantiate a {@link HwTimingResourceAssociation} proxy.
     * 
     * @return a {@link HwTimingResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("441e861c-2f7c-45fb-ab40-16c234146562")
    public static HwTimingResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceAssociation.STEREOTYPE_NAME);
        return HwTimingResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceAssociation} proxy from a {@link Association} stereotyped << HwTimingResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwTimingResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("3e85fa16-c464-4ac8-a88e-4d6d8a294e92")
    public static HwTimingResourceAssociation instantiate(final Association obj) {
        return HwTimingResourceAssociation.canInstantiate(obj) ? new HwTimingResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceAssociation} proxy from a {@link Association} stereotyped << HwTimingResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwTimingResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e88d9540-abf8-4876-9dcd-4cf6fb4f2719")
    public static HwTimingResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwTimingResourceAssociation.canInstantiate(obj))
        	return new HwTimingResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("964d987c-6231-4696-8a55-507425eddbaf")
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
        HwTimingResourceAssociation other = (HwTimingResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("3e76cb7e-17c3-4880-978b-b66da81393a2")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("647a5c1b-13e1-4791-87d0-bd1f06435c52")
    public String getHwTimingResource_Association_description() {
        return this.elt.getTagValue(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Association_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a9f29015-a84b-4e58-aabd-4da184f40901")
    public List<String> getHwTimingResource_Association_endPoints() {
        return this.elt.getTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81f68e75-27e0-448d-8c8c-e5b5822ce6e4")
    public String getHwTimingResource_Association_frequency() {
        return this.elt.getTagValue(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5672d36b-e292-4e7b-9f1e-20b65800c70d")
    public List<String> getHwTimingResource_Association_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d61a9bb5-f94d-4678-8435-046877369755")
    public List<String> getHwTimingResource_Association_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b477d598-c26f-4ee3-ba45-081f7621da20")
    public List<String> getHwTimingResource_Association_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("851f938d-88f1-4e87-a2c8-893dda351574")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("95b0e7c5-f738-49ca-bd02-dfde3c63043d")
    public void setHwTimingResource_Association_description(final String value) {
        this.elt.putTagValue(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Association_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("191b6ada-e7ac-4eb7-83fe-960934e54686")
    public void setHwTimingResource_Association_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5f2ef088-2331-46da-8a6a-15d2b025d0db")
    public void setHwTimingResource_Association_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cc425b56-d62c-4617-a1d0-2368d4100de1")
    public void setHwTimingResource_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52bc73f0-8dd9-4fbc-b5bb-8dbb3decbffc")
    public void setHwTimingResource_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e154ede1-4efc-40aa-a80a-7170e100487d")
    public void setHwTimingResource_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("5d137240-e104-4a31-b436-93eec57c596c")
    protected HwTimingResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("ced61591-c259-4a92-b09f-c347b129fac9")
    public static final class MdaTypes {
        @objid ("f09e9389-ea73-483f-b83e-a02381f56a46")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6675088a-f628-4975-9f7c-75faeb7e1ee4")
        public static TagType HWTIMINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        @objid ("9ec52d7c-bd06-432f-97d2-959eeebd1a59")
        public static TagType HWTIMINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("35dbe5f8-27ae-4eca-9312-16b6dd4e2cac")
        public static TagType HWTIMINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("78c11289-9633-41d5-bfb3-e9e977c952b2")
        public static TagType HWTIMINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        @objid ("6a5b53d9-2162-4309-bd2c-81ada5c0f165")
        public static TagType HWTIMINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT;

        @objid ("a560b810-f943-4b5e-9a99-f37898b73540")
        public static TagType HWTIMINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        @objid ("944a6da9-916a-4fcc-b610-eac932dfc036")
        private static Stereotype MDAASSOCDEP;

        @objid ("fa1afa24-0ebf-488e-8963-09982f41c3dd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("789dcab9-cfe9-448e-a51f-165eee7f053f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8a62fde0-10ae-11df-81d9-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48367478-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48367479-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4836747a-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4836747b-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "be22d2d6-1709-11df-b92a-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "57d5ae52-8dfb-11e0-8741-0027103f347c");
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
