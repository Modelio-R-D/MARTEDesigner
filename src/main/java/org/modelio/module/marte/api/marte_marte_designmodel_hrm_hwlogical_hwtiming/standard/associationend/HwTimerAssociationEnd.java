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
 * Proxy class to handle a {@link AssociationEnd} with << HwTimer_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("147287bf-34b4-41b1-a35f-a7b512d57486")
public class HwTimerAssociationEnd extends HwTimingResourceAssociationEnd {
    @objid ("2d9ed2f2-1055-481e-871d-9e5e11b7ca8f")
    public static final String STEREOTYPE_NAME = "HwTimer_AssociationEnd";

    @objid ("57268c5d-27a3-4ec2-89af-7ed2928c9609")
    public static final String HWTIMER_ASSOCIATIONEND_COUNTERWIDTH_TAGTYPE = "HwTimer_AssociationEnd_counterWidth";

    @objid ("e18334c4-ba65-4be8-8bae-978f5a2fb4d3")
    public static final String HWTIMER_ASSOCIATIONEND_INPUTCLOCK_TAGTYPE = "HwTimer_AssociationEnd_inputClock";

    @objid ("eef8e3b8-2b0d-42b2-9069-893fd8992765")
    public static final String HWTIMER_ASSOCIATIONEND_NBCOUNTERS_TAGTYPE = "HwTimer_AssociationEnd_nbCounters";

    /**
     * Tells whether a {@link HwTimerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwTimer_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("741589b2-9efb-4e54-ac58-ce4940530a9b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwTimer_AssociationEnd >> then instantiate a {@link HwTimerAssociationEnd} proxy.
     * 
     * @return a {@link HwTimerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("56c00276-bda2-4d4d-ae06-3ed03dc7d59d")
    public static HwTimerAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerAssociationEnd.STEREOTYPE_NAME);
        return HwTimerAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwTimerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwTimer_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwTimerAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("a6467ae6-a217-488a-b95e-50d6195e9146")
    public static HwTimerAssociationEnd instantiate(final AssociationEnd obj) {
        return HwTimerAssociationEnd.canInstantiate(obj) ? new HwTimerAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwTimer_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwTimerAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0e919c54-2fc5-4186-9652-466ae7578a03")
    public static HwTimerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwTimerAssociationEnd.canInstantiate(obj))
        	return new HwTimerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwTimerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("951f33bc-3da0-4aa9-992b-7c1805b03ef8")
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
        HwTimerAssociationEnd other = (HwTimerAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("24e7b3b1-c5fe-4eb6-aa8b-c9258f17a008")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwTimer_AssociationEnd_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ee4e9063-a336-4a51-aad1-d4ab90423baa")
    public String getHwTimer_AssociationEnd_counterWidth() {
        return this.elt.getTagValue(HwTimerAssociationEnd.MdaTypes.HWTIMER_ASSOCIATIONEND_COUNTERWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_AssociationEnd_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d0c361ab-b2f5-4369-b1b5-de43197c6236")
    public String getHwTimer_AssociationEnd_inputClock() {
        return this.elt.getTagValue(HwTimerAssociationEnd.MdaTypes.HWTIMER_ASSOCIATIONEND_INPUTCLOCK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_AssociationEnd_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1203bb6-f778-4f6f-8856-e5448da0a1a4")
    public String getHwTimer_AssociationEnd_nbCounters() {
        return this.elt.getTagValue(HwTimerAssociationEnd.MdaTypes.HWTIMER_ASSOCIATIONEND_NBCOUNTERS_TAGTYPE_ELT);
    }

    @objid ("214f7e04-464c-4f68-a586-577aaa503879")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimer_AssociationEnd_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0055b17-1ad8-4f82-a215-65c607b2baa8")
    public void setHwTimer_AssociationEnd_counterWidth(final String value) {
        this.elt.putTagValue(HwTimerAssociationEnd.MdaTypes.HWTIMER_ASSOCIATIONEND_COUNTERWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_AssociationEnd_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("403c80cd-3922-4878-b783-020f920e826e")
    public void setHwTimer_AssociationEnd_inputClock(final String value) {
        this.elt.putTagValue(HwTimerAssociationEnd.MdaTypes.HWTIMER_ASSOCIATIONEND_INPUTCLOCK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_AssociationEnd_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("742e0ddc-bc05-4a4b-a6a3-489ce26254e2")
    public void setHwTimer_AssociationEnd_nbCounters(final String value) {
        this.elt.putTagValue(HwTimerAssociationEnd.MdaTypes.HWTIMER_ASSOCIATIONEND_NBCOUNTERS_TAGTYPE_ELT, value);
    }

    @objid ("3a8e8e3b-cb5c-4b84-8f12-4e5f18db188a")
    protected HwTimerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("5aa2a52b-8600-4604-be14-80a5e1bee731")
    public static final class MdaTypes {
        @objid ("95c6341d-7341-4fa6-9e20-fc6b8f7c9c21")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("04669174-9bb7-49e4-b337-2d527b816047")
        public static TagType HWTIMER_ASSOCIATIONEND_NBCOUNTERS_TAGTYPE_ELT;

        @objid ("4dc7ed20-f022-4552-9b2d-8e8fef7093f1")
        public static TagType HWTIMER_ASSOCIATIONEND_COUNTERWIDTH_TAGTYPE_ELT;

        @objid ("790fd048-4ce2-4e7b-86a5-635f3f5a2eda")
        public static TagType HWTIMER_ASSOCIATIONEND_INPUTCLOCK_TAGTYPE_ELT;

        @objid ("4c2385c1-e2e5-4f13-b4b3-2905ebb46d04")
        private static Stereotype MDAASSOCDEP;

        @objid ("d9ff25a9-9378-4916-8bb8-d14f87eadd9e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dcc461ad-08f5-446c-a832-5c81195d70c1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "012bf258-0ccf-11df-8525-001302895b2b");
            HWTIMER_ASSOCIATIONEND_NBCOUNTERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54ae-0ccf-11df-8525-001302895b2b");
            HWTIMER_ASSOCIATIONEND_COUNTERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54b5-0ccf-11df-8525-001302895b2b");
            HWTIMER_ASSOCIATIONEND_INPUTCLOCK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54bc-0ccf-11df-8525-001302895b2b");
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
