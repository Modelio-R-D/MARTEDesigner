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
 * Proxy class to handle a {@link AssociationEnd} with << HwTimer_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("147287bf-34b4-41b1-a35f-a7b512d57486")
public class HwTimerAssociationEnd extends HwTimingResourceAssociationEnd {
    @objid ("f1fed058-2feb-4b81-b5e7-9fac27ed0d60")
    public static final String STEREOTYPE_NAME = "HwTimer_AssociationEnd";

    @objid ("fc70aa30-ed33-4b99-ad4a-663cf165e272")
    public static final String HWTIMER_ASSOCIATIONEND_COUNTERWIDTH_TAGTYPE = "HwTimer_AssociationEnd_counterWidth";

    @objid ("2a2eb053-9806-42bc-a905-33cb8ae47059")
    public static final String HWTIMER_ASSOCIATIONEND_INPUTCLOCK_TAGTYPE = "HwTimer_AssociationEnd_inputClock";

    @objid ("db8982b5-7b42-464e-b039-e1b0085a8331")
    public static final String HWTIMER_ASSOCIATIONEND_NBCOUNTERS_TAGTYPE = "HwTimer_AssociationEnd_nbCounters";

    /**
     * Tells whether a {@link HwTimerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwTimer_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("377f702b-35bd-45b8-9765-7b99fcc91a3d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwTimer_AssociationEnd >> then instantiate a {@link HwTimerAssociationEnd} proxy.
     * 
     * @return a {@link HwTimerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("940c337c-f5df-42f9-ab92-325b018b8f48")
    public static HwTimerAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerAssociationEnd.STEREOTYPE_NAME);
        return HwTimerAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwTimerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwTimer_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwTimerAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("e8c8c903-eda8-4ebc-9102-bf6994ba7efc")
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
    @objid ("e8c76d70-895b-4998-99bb-bed7f9008e36")
    public static HwTimerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwTimerAssociationEnd.canInstantiate(obj))
        	return new HwTimerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwTimerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("996ad482-8ec7-444b-b112-b827b844540f")
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
    @objid ("b573a5f8-49df-4c3d-b212-0ab9bbdc8f1e")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwTimer_AssociationEnd_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("af640a72-4b58-4408-bbe0-d59203a6416f")
    public String getHwTimer_AssociationEnd_counterWidth() {
        return this.elt.getTagValue(HwTimerAssociationEnd.MdaTypes.HWTIMER_ASSOCIATIONEND_COUNTERWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_AssociationEnd_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67545a98-6441-4db3-a58a-d9d271fbd4c8")
    public String getHwTimer_AssociationEnd_inputClock() {
        return this.elt.getTagValue(HwTimerAssociationEnd.MdaTypes.HWTIMER_ASSOCIATIONEND_INPUTCLOCK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_AssociationEnd_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ad21e023-ee3e-4377-a665-b753eff0bd84")
    public String getHwTimer_AssociationEnd_nbCounters() {
        return this.elt.getTagValue(HwTimerAssociationEnd.MdaTypes.HWTIMER_ASSOCIATIONEND_NBCOUNTERS_TAGTYPE_ELT);
    }

    @objid ("79e8b70e-7752-41b7-ac8e-471d4a4ccf35")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimer_AssociationEnd_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("23ddd38f-72a6-4f4c-b2ef-2c0c8afa866b")
    public void setHwTimer_AssociationEnd_counterWidth(final String value) {
        this.elt.putTagValue(HwTimerAssociationEnd.MdaTypes.HWTIMER_ASSOCIATIONEND_COUNTERWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_AssociationEnd_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c91a3014-41ec-4471-adca-79f50abf85a7")
    public void setHwTimer_AssociationEnd_inputClock(final String value) {
        this.elt.putTagValue(HwTimerAssociationEnd.MdaTypes.HWTIMER_ASSOCIATIONEND_INPUTCLOCK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_AssociationEnd_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a64c3b39-1c34-4b84-a5d1-306e14c6a688")
    public void setHwTimer_AssociationEnd_nbCounters(final String value) {
        this.elt.putTagValue(HwTimerAssociationEnd.MdaTypes.HWTIMER_ASSOCIATIONEND_NBCOUNTERS_TAGTYPE_ELT, value);
    }

    @objid ("edbe9f95-7859-4076-b9b9-ef72cd81999e")
    protected HwTimerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("5aa2a52b-8600-4604-be14-80a5e1bee731")
    public static final class MdaTypes {
        @objid ("cca1d66c-06f4-4341-a8c8-89f98043bd4b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8576ed90-9fc2-4b6f-b6df-8fef42561ee7")
        public static TagType HWTIMER_ASSOCIATIONEND_NBCOUNTERS_TAGTYPE_ELT;

        @objid ("dff131af-5336-40c0-a937-cd58fad19bfc")
        public static TagType HWTIMER_ASSOCIATIONEND_COUNTERWIDTH_TAGTYPE_ELT;

        @objid ("24860dbc-9ca5-4e28-adef-936d4b47f1ee")
        public static TagType HWTIMER_ASSOCIATIONEND_INPUTCLOCK_TAGTYPE_ELT;

        @objid ("f975a3aa-ff8b-468e-b570-830d966c7876")
        private static Stereotype MDAASSOCDEP;

        @objid ("79567d8a-88a4-4924-be65-ebe7cc375cc2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b6eacbf9-59b9-451a-b041-05dee63a6a15")
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
