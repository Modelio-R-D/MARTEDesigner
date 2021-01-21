/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwClock_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("05f717c5-a878-4b7a-9c37-cf2e894236e3")
public class HwClockParameter extends HwTimingResourceParameter {
    @objid ("10a7959b-016a-476a-bd04-aa15ac9c6974")
    public static final String STEREOTYPE_NAME = "HwClock_Parameter";

    @objid ("ee2cf33b-5bf7-4d7b-abbb-e7fc55ac844f")
    public static final String HWCLOCK_PARAMETER_FREQUENCY_TAGTYPE = "HwClock_Parameter_frequency";

    /**
     * Tells whether a {@link HwClockParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwClock_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c5433c9f-f748-4fa9-a3e6-dfbbb40bfa09")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwClockParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwClock_Parameter >> then instantiate a {@link HwClockParameter} proxy.
     * 
     * @return a {@link HwClockParameter} proxy on the created {@link Parameter}.
     */
    @objid ("cda97b83-de4b-4b13-b5ff-920450007bde")
    public static HwClockParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwClockParameter.STEREOTYPE_NAME);
        return HwClockParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwClockParameter} proxy from a {@link Parameter} stereotyped << HwClock_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwClockParameter} proxy or <i>null</i>.
     */
    @objid ("f94ba7a2-1b99-479b-848b-f9f43fabd8bb")
    public static HwClockParameter instantiate(final Parameter obj) {
        return HwClockParameter.canInstantiate(obj) ? new HwClockParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwClockParameter} proxy from a {@link Parameter} stereotyped << HwClock_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwClockParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("61efcf27-1f79-4c6e-9c46-ccae40be8191")
    public static HwClockParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwClockParameter.canInstantiate(obj))
        	return new HwClockParameter(obj);
        else
        	throw new IllegalArgumentException("HwClockParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("09f86cdc-cdde-4519-ae4e-018590ce84b2")
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
        HwClockParameter other = (HwClockParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("8edb7efe-2095-4ee2-946e-da1060d4a0dd")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwClock_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1183a671-b671-4970-8b4d-0a67d43ed448")
    public String getHwClock_Parameter_frequency() {
        return this.elt.getTagValue(HwClockParameter.MdaTypes.HWCLOCK_PARAMETER_FREQUENCY_TAGTYPE_ELT);
    }

    @objid ("6a478506-b385-43f4-b6ea-eb4f7bb08f49")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwClock_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cf4a7a14-6d1c-44fc-812d-7295b5837ace")
    public void setHwClock_Parameter_frequency(final String value) {
        this.elt.putTagValue(HwClockParameter.MdaTypes.HWCLOCK_PARAMETER_FREQUENCY_TAGTYPE_ELT, value);
    }

    @objid ("6d22cec1-346f-47bc-9354-bd8765012e62")
    protected HwClockParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("73754908-c92b-45ea-9ca8-d9208a3127c5")
    public static final class MdaTypes {
        @objid ("69cf142a-6774-46b4-9971-6fecc57a047c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7c5d3e69-22be-48fc-8fed-488ba9f046a3")
        public static TagType HWCLOCK_PARAMETER_FREQUENCY_TAGTYPE_ELT;

        @objid ("3a312046-e2a4-49c4-b4e4-821ee4a35507")
        private static Stereotype MDAASSOCDEP;

        @objid ("aca48520-ff23-4039-a2f8-009481d545d3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8dbf1ca9-16e1-41bd-bf83-5f0ce307b652")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01272db4-0ccf-11df-8525-001302895b2b");
            HWCLOCK_PARAMETER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ee004332-123c-11df-8f55-0014222a9f79");
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
