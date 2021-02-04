/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << Alarm_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b01fbc3c-7db7-4b7b-a97d-ba8b181b4508")
public class AlarmAssociationEnd extends InterruptResourceAssociationEnd {
    @objid ("b4e0b2b3-90cd-4e83-a1c6-610bdad3adee")
    public static final String STEREOTYPE_NAME = "Alarm_AssociationEnd";

    @objid ("0339b90b-15d3-4e85-b823-47bbba369f9e")
    public static final String ALARM_ASSOCIATIONEND_ISWATCHDOG_TAGTYPE = "Alarm_AssociationEnd_isWatchdog";

    @objid ("06049d0f-603c-4930-8ddd-5fa8d4e39027")
    public static final String ALARM_ASSOCIATIONEND_TIMERS_TAGTYPE = "Alarm_AssociationEnd_timers";

    /**
     * Tells whether a {@link AlarmAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Alarm_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f0ee9d88-462c-439c-924d-a294d73cfe72")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Alarm_AssociationEnd >> then instantiate a {@link AlarmAssociationEnd} proxy.
     * 
     * @return a {@link AlarmAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("60dd014c-4f12-4526-b93f-7b5f71355b9b")
    public static AlarmAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmAssociationEnd.STEREOTYPE_NAME);
        return AlarmAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link AlarmAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Alarm_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link AlarmAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("8f157c6b-07ea-4e0d-9724-1d9995e8d607")
    public static AlarmAssociationEnd instantiate(final AssociationEnd obj) {
        return AlarmAssociationEnd.canInstantiate(obj) ? new AlarmAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlarmAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Alarm_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link AlarmAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7d26a54d-7e4e-4fdb-84a0-827a5e8795a1")
    public static AlarmAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (AlarmAssociationEnd.canInstantiate(obj))
        	return new AlarmAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("AlarmAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b1032669-897b-45a7-9afa-541f1982e466")
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
        AlarmAssociationEnd other = (AlarmAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Alarm_AssociationEnd_timers'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("05efc7d9-7692-442e-9533-632cc96e038c")
    public List<String> getAlarm_AssociationEnd_timers() {
        return this.elt.getTagValues(AlarmAssociationEnd.MdaTypes.ALARM_ASSOCIATIONEND_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("67269273-f397-4a80-aab1-418e9f9d9951")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("dc931d4f-1512-48bb-b610-75e6f33b2af7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_AssociationEnd_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3ae28248-af9d-4b29-acee-b5767e5799ee")
    public boolean isAlarm_AssociationEnd_isWatchdog() {
        return this.elt.isTagged(AlarmAssociationEnd.MdaTypes.ALARM_ASSOCIATIONEND_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_AssociationEnd_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5f89f620-89eb-4b86-93e7-94109bfc994b")
    public void setAlarm_AssociationEnd_isWatchdog(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AlarmAssociationEnd.MdaTypes.ALARM_ASSOCIATIONEND_ISWATCHDOG_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AlarmAssociationEnd.MdaTypes.ALARM_ASSOCIATIONEND_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'Alarm_AssociationEnd_timers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e6ec44f-32b4-4b81-81c7-34adb2c2b501")
    public void setAlarm_AssociationEnd_timers(final List<String> values) {
        this.elt.putTagValues(AlarmAssociationEnd.MdaTypes.ALARM_ASSOCIATIONEND_TIMERS_TAGTYPE_ELT, values);
    }

    @objid ("0b980fd7-280e-4199-87c0-9d430c271c2a")
    protected AlarmAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("e347bdbf-f9db-4c2a-8277-5c281e54e18b")
    public static final class MdaTypes {
        @objid ("bb1086c4-6fd9-47b6-9d58-a30ac7256608")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ebc16f80-bf98-4fc7-b98c-8da4f4cc0b6f")
        public static TagType ALARM_ASSOCIATIONEND_ISWATCHDOG_TAGTYPE_ELT;

        @objid ("80b7fd0c-0a23-480a-ae8e-1e75a517ace2")
        public static TagType ALARM_ASSOCIATIONEND_TIMERS_TAGTYPE_ELT;

        @objid ("22b6e8a8-d56f-462e-995b-f5d28a16d2e6")
        private static Stereotype MDAASSOCDEP;

        @objid ("6da03849-7c7e-4b65-b4d3-285fd12ed308")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c6dfc840-0245-468a-8c58-441c43963595")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01f43540-0ccf-11df-8525-001302895b2b");
            ALARM_ASSOCIATIONEND_ISWATCHDOG_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01f43547-0ccf-11df-8525-001302895b2b");
            ALARM_ASSOCIATIONEND_TIMERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01f4354e-0ccf-11df-8525-001302895b2b");
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
