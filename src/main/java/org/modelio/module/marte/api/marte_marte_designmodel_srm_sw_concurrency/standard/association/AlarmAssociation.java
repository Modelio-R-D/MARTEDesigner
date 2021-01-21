/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << Alarm_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a28b5670-7bda-4904-9db8-28527dd0e795")
public class AlarmAssociation extends InterruptResourceAssociation {
    @objid ("fb672f26-e648-4f56-a6d4-60cc8bf352e4")
    public static final String STEREOTYPE_NAME = "Alarm_Association";

    @objid ("e15fd16d-48bd-4915-a7b1-6646fd7140d2")
    public static final String ALARM_ASSOCIATION_ISWATCHDOG_TAGTYPE = "Alarm_Association_isWatchdog";

    @objid ("e240ed1d-f209-46fe-96c8-c76483f83cb6")
    public static final String ALARM_ASSOCIATION_TIMERS_TAGTYPE = "Alarm_Association_timers";

    /**
     * Tells whether a {@link AlarmAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << Alarm_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e3961b73-4e93-4b24-98f6-14d25e9a1951")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << Alarm_Association >> then instantiate a {@link AlarmAssociation} proxy.
     * 
     * @return a {@link AlarmAssociation} proxy on the created {@link Association}.
     */
    @objid ("4e331ff7-532d-4a13-9d72-9d6a11da89ee")
    public static AlarmAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmAssociation.STEREOTYPE_NAME);
        return AlarmAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link AlarmAssociation} proxy from a {@link Association} stereotyped << Alarm_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link AlarmAssociation} proxy or <i>null</i>.
     */
    @objid ("a96d6544-73c8-422e-a959-14378560569b")
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
    @objid ("ce310a16-16cd-48b8-9f71-c06e3a35cc2f")
    public static AlarmAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (AlarmAssociation.canInstantiate(obj))
        	return new AlarmAssociation(obj);
        else
        	throw new IllegalArgumentException("AlarmAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("46356fef-df55-4e0d-82a9-8e6445fbef59")
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
    @objid ("1db6caff-eb85-4551-86bb-0f6cc7470b46")
    public List<String> getAlarm_Association_timers() {
        return this.elt.getTagValues(AlarmAssociation.MdaTypes.ALARM_ASSOCIATION_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("e008b27d-b60e-4724-88ae-13e5d21892a2")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("879b7b3e-fceb-4066-872c-96c5e96540bf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Association_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("844fcc51-e6b4-4642-ae7d-2541b0ee20eb")
    public boolean isAlarm_Association_isWatchdog() {
        return this.elt.isTagged(AlarmAssociation.MdaTypes.ALARM_ASSOCIATION_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Association_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c382aa6-9c23-484c-bc45-bdc24af151f3")
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
    @objid ("a1228a9a-366f-4cbe-966c-758b63ee8f35")
    public void setAlarm_Association_timers(final List<String> values) {
        this.elt.putTagValues(AlarmAssociation.MdaTypes.ALARM_ASSOCIATION_TIMERS_TAGTYPE_ELT, values);
    }

    @objid ("d76dddd6-2718-4ea7-93e4-0ab6f6bd34b7")
    protected AlarmAssociation(final Association elt) {
        super(elt);
    }

    @objid ("d2fba16f-d9b4-4cd0-b67d-5722cf4fd718")
    public static final class MdaTypes {
        @objid ("c8bf154b-af9b-42b5-a1a4-adf196fccafa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("06528f42-d107-4353-9328-2b3ef92017fc")
        public static TagType ALARM_ASSOCIATION_ISWATCHDOG_TAGTYPE_ELT;

        @objid ("b91be0aa-31a3-454c-a9f5-e21334db0809")
        public static TagType ALARM_ASSOCIATION_TIMERS_TAGTYPE_ELT;

        @objid ("afff4259-fa86-42a9-9ebc-2190d6eda9be")
        private static Stereotype MDAASSOCDEP;

        @objid ("73d0dd6d-0024-4a96-999f-81aa736fa8a2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eb2818d4-281e-41bc-aa10-cf583e0dd556")
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
