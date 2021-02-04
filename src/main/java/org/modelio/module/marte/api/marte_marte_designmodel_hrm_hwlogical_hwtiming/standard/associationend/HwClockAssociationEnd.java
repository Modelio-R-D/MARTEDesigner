/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("47ef4a1f-2ac3-4b9c-a182-a0cf6e07d129")
    public static final String STEREOTYPE_NAME = "HwClock_AssociationEnd";

    @objid ("52abdcd8-49c5-4d22-8a28-488259da2020")
    public static final String HWCLOCK_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwClock_AssociationEnd_frequency";

    /**
     * Tells whether a {@link HwClockAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwClock_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3c98ebe5-1d7e-4220-9b69-a252e1c028c9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwClockAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwClock_AssociationEnd >> then instantiate a {@link HwClockAssociationEnd} proxy.
     * 
     * @return a {@link HwClockAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("88b85363-bd23-4a61-8f5f-7b504352f014")
    public static HwClockAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwClockAssociationEnd.STEREOTYPE_NAME);
        return HwClockAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwClockAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwClock_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwClockAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("a3fbe4af-abbf-415a-8ab8-884d303c1fe1")
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
    @objid ("ff346eda-c22a-4f90-ad9d-e4135e0a4945")
    public static HwClockAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwClockAssociationEnd.canInstantiate(obj))
        	return new HwClockAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwClockAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1fd33e8d-9521-44cc-92fa-8af0a589d014")
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
    @objid ("d92c6851-1c96-449e-ba55-4935038f3db4")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwClock_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e8672dd8-ca2b-429f-991a-2e4047b161f5")
    public String getHwClock_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwClockAssociationEnd.MdaTypes.HWCLOCK_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    @objid ("52f1e02f-6954-425b-9480-3eb29260273d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwClock_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0fa4664d-9182-4f14-8b77-de4274b93594")
    public void setHwClock_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwClockAssociationEnd.MdaTypes.HWCLOCK_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    @objid ("c257e19e-b557-4396-ac18-3a9e3a1052a3")
    protected HwClockAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("bfa0e88b-8633-4094-b973-a829e591c91d")
    public static final class MdaTypes {
        @objid ("3cb82fb3-a12f-4642-a6a7-64d8e0140dd8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad6bc0c8-5f45-4738-a13f-20a07c554e7b")
        public static TagType HWCLOCK_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        @objid ("600f15f7-7ddf-407c-b933-367965e6ab1e")
        private static Stereotype MDAASSOCDEP;

        @objid ("b548b97d-84d5-4837-a6d1-0d80ce453f61")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("28b9f7e8-ce91-4404-956f-2a7e7006a01c")
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
