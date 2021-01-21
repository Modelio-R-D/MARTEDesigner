/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("4bd11094-6292-4b10-8f51-79f48b945476")
    public static final String STEREOTYPE_NAME = "Alarm_AssociationEnd";

    @objid ("1d828b6e-79e1-402c-bafc-dd90ec66e090")
    public static final String ALARM_ASSOCIATIONEND_ISWATCHDOG_TAGTYPE = "Alarm_AssociationEnd_isWatchdog";

    @objid ("504d7928-2a44-4dd2-aa84-9aed90af72bc")
    public static final String ALARM_ASSOCIATIONEND_TIMERS_TAGTYPE = "Alarm_AssociationEnd_timers";

    /**
     * Tells whether a {@link AlarmAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Alarm_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("265b037c-c9f4-43d1-b2b1-0011c928146d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Alarm_AssociationEnd >> then instantiate a {@link AlarmAssociationEnd} proxy.
     * 
     * @return a {@link AlarmAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("53121dec-8cad-4a1b-a51d-ea1c57f9a601")
    public static AlarmAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmAssociationEnd.STEREOTYPE_NAME);
        return AlarmAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link AlarmAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Alarm_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link AlarmAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("3e6659e7-591a-41b8-965a-7973eae9b548")
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
    @objid ("94dbe1ef-b60f-41e5-882f-bee44e724c65")
    public static AlarmAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (AlarmAssociationEnd.canInstantiate(obj))
        	return new AlarmAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("AlarmAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("09088041-e687-4b00-b882-f2e92ea4471d")
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
    @objid ("c38b36bc-2d5a-4920-b984-9181c3ef5ec6")
    public List<String> getAlarm_AssociationEnd_timers() {
        return this.elt.getTagValues(AlarmAssociationEnd.MdaTypes.ALARM_ASSOCIATIONEND_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("cad82ce0-1628-4baf-a53d-46fc6605e7a6")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("c90ab80e-1b7d-4d06-a8c0-65f8da573233")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_AssociationEnd_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7f0c0903-a418-44c5-8f48-165d1846f99b")
    public boolean isAlarm_AssociationEnd_isWatchdog() {
        return this.elt.isTagged(AlarmAssociationEnd.MdaTypes.ALARM_ASSOCIATIONEND_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_AssociationEnd_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("205b07a4-a4d0-48dc-9bef-8e6eeac9f43a")
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
    @objid ("b37686f3-95aa-4777-b0aa-4ba6fa39f716")
    public void setAlarm_AssociationEnd_timers(final List<String> values) {
        this.elt.putTagValues(AlarmAssociationEnd.MdaTypes.ALARM_ASSOCIATIONEND_TIMERS_TAGTYPE_ELT, values);
    }

    @objid ("9bf9358f-9c41-425b-be85-118e08d23478")
    protected AlarmAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("e347bdbf-f9db-4c2a-8277-5c281e54e18b")
    public static final class MdaTypes {
        @objid ("cd786d1a-1053-48c8-b7c9-3f14b9ffc780")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ee6dce09-e349-4dd0-8bc7-271416e3bcd0")
        public static TagType ALARM_ASSOCIATIONEND_ISWATCHDOG_TAGTYPE_ELT;

        @objid ("ed8478f9-2fb7-4250-8a77-a499747a1741")
        public static TagType ALARM_ASSOCIATIONEND_TIMERS_TAGTYPE_ELT;

        @objid ("8dd8ab84-4be4-4344-b2a5-05b1f0301d86")
        private static Stereotype MDAASSOCDEP;

        @objid ("0847c7e6-e608-465f-80cb-f026c5251d8f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("22e993e0-d94b-458a-930e-2d0a5910c9c8")
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
