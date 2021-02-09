/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << Alarm_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class AlarmAssociation extends InterruptResourceAssociation {
    public static final String STEREOTYPE_NAME = "Alarm_Association";

    public static final String ALARM_ASSOCIATION_ISWATCHDOG_TAGTYPE = "Alarm_Association_isWatchdog";

    public static final String ALARM_ASSOCIATION_TIMERS_TAGTYPE = "Alarm_Association_timers";

    /**
     * Tells whether a {@link AlarmAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << Alarm_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << Alarm_Association >> then instantiate a {@link AlarmAssociation} proxy.
     * 
     * @return a {@link AlarmAssociation} proxy on the created {@link Association}.
     */
    public static AlarmAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmAssociation.STEREOTYPE_NAME);
        return AlarmAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link AlarmAssociation} proxy from a {@link Association} stereotyped << Alarm_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link AlarmAssociation} proxy or <i>null</i>.
     */
    public static AlarmAssociation instantiate(final Association obj) {
        return AlarmAssociation.canInstantiate(obj) ? new AlarmAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlarmAssociation} proxy from a {@link Association} stereotyped << Alarm_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link AlarmAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static AlarmAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (AlarmAssociation.canInstantiate(obj))
        	return new AlarmAssociation(obj);
        else
        	throw new IllegalArgumentException("AlarmAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        AlarmAssociation other = (AlarmAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Alarm_Association_timers'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getAlarm_Association_timers() {
        return this.elt.getTagValues(AlarmAssociation.MdaTypes.ALARM_ASSOCIATION_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Association_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isAlarm_Association_isWatchdog() {
        return this.elt.isTagged(AlarmAssociation.MdaTypes.ALARM_ASSOCIATION_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Association_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAlarm_Association_isWatchdog(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AlarmAssociation.MdaTypes.ALARM_ASSOCIATION_ISWATCHDOG_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AlarmAssociation.MdaTypes.ALARM_ASSOCIATION_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'Alarm_Association_timers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAlarm_Association_timers(final List<String> values) {
        this.elt.putTagValues(AlarmAssociation.MdaTypes.ALARM_ASSOCIATION_TIMERS_TAGTYPE_ELT, values);
    }

    protected AlarmAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType ALARM_ASSOCIATION_ISWATCHDOG_TAGTYPE_ELT;

        public static TagType ALARM_ASSOCIATION_TIMERS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0163f791-10d1-11df-81d9-0014222a9f79");
            ALARM_ASSOCIATION_ISWATCHDOG_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0163f792-10d1-11df-81d9-0014222a9f79");
            ALARM_ASSOCIATION_TIMERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0163f793-10d1-11df-81d9-0014222a9f79");
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
