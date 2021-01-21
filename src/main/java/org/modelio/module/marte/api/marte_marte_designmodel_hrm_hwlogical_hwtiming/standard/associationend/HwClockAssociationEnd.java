/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwClock_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("77c92383-8cce-4796-bd1f-b96f925559a4")
public class HwClockAssociationEnd extends HwTimingResourceAssociationEnd {
    @objid ("c9fa2b45-9598-493c-92ed-f3558069e2dd")
    public static final String STEREOTYPE_NAME = "HwClock_AssociationEnd";

    @objid ("d45e8ad3-cc7d-40ff-9657-82d581daf106")
    public static final String HWCLOCK_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwClock_AssociationEnd_frequency";

    /**
     * Tells whether a {@link HwClockAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwClock_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4626a2d1-07d7-47ba-b5bb-96979a5849f1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwClockAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwClock_AssociationEnd >> then instantiate a {@link HwClockAssociationEnd} proxy.
     * 
     * @return a {@link HwClockAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("f5fb66d8-8382-48d2-9e02-c9539f92ad24")
    public static HwClockAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwClockAssociationEnd.STEREOTYPE_NAME);
        return HwClockAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwClockAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwClock_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwClockAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("36f2aab2-eef4-4788-af86-f32096c51a57")
    public static HwClockAssociationEnd instantiate(final AssociationEnd obj) {
        return HwClockAssociationEnd.canInstantiate(obj) ? new HwClockAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwClockAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwClock_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwClockAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c1b1d9ed-7308-4f23-93f3-5a32ec3d706d")
    public static HwClockAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwClockAssociationEnd.canInstantiate(obj))
        	return new HwClockAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwClockAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4db4f122-ca01-4838-85e2-f529ed2e2343")
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
        HwClockAssociationEnd other = (HwClockAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("c1e38d6b-c19d-4189-8790-61d33b620f65")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwClock_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bcfa15c2-b409-47e4-97ea-edc149b0bc02")
    public String getHwClock_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwClockAssociationEnd.MdaTypes.HWCLOCK_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    @objid ("2a076d46-e4e3-4d86-8603-1551e2f45081")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwClock_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ea4d78d-30e1-42f7-9d2d-733e5dbc2907")
    public void setHwClock_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwClockAssociationEnd.MdaTypes.HWCLOCK_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    @objid ("271e3190-a68d-4d14-851c-aaf3df043b55")
    protected HwClockAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("bfa0e88b-8633-4094-b973-a829e591c91d")
    public static final class MdaTypes {
        @objid ("af61d313-4932-45d1-b037-c1988afaa080")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a40e5fb0-8c69-48d9-bd5e-5a84d5097b27")
        public static TagType HWCLOCK_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        @objid ("b4bad1e8-abde-4a28-980e-ccbcd6cf8bf0")
        private static Stereotype MDAASSOCDEP;

        @objid ("5d10cba7-9600-414c-b9c4-2e24f31efa48")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c9070ed-c82e-4dd9-b727-83beb527469c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01272db5-0ccf-11df-8525-001302895b2b");
            HWCLOCK_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f31d169d-123c-11df-8f55-0014222a9f79");
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
