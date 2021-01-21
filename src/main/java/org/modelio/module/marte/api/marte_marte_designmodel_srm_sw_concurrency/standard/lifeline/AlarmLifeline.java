/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << Alarm_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6493b338-090a-4a43-b2f2-327b6d5afb93")
public class AlarmLifeline extends InterruptResourceLifeline {
    @objid ("c9320577-91ea-4144-8003-e020b293b5e4")
    public static final String STEREOTYPE_NAME = "Alarm_Lifeline";

    @objid ("3af71b10-ccfd-4c90-92b1-95c437dd9c92")
    public static final String ALARM_LIFELINE_ISWATCHDOG_TAGTYPE = "Alarm_Lifeline_isWatchdog";

    @objid ("14680c4a-9dc1-4150-9d65-91303e43a795")
    public static final String ALARM_LIFELINE_TIMERS_TAGTYPE = "Alarm_Lifeline_timers";

    /**
     * Tells whether a {@link AlarmLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << Alarm_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c9097997-d9b2-4d6d-9a6f-11af04c0e47f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << Alarm_Lifeline >> then instantiate a {@link AlarmLifeline} proxy.
     * 
     * @return a {@link AlarmLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("e4407845-99be-4d22-b179-55de46347dfa")
    public static AlarmLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmLifeline.STEREOTYPE_NAME);
        return AlarmLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link AlarmLifeline} proxy from a {@link Lifeline} stereotyped << Alarm_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link AlarmLifeline} proxy or <i>null</i>.
     */
    @objid ("f7b632dd-fd87-41dc-8ecb-d2bd12b3357f")
    public static AlarmLifeline instantiate(final Lifeline obj) {
        return AlarmLifeline.canInstantiate(obj) ? new AlarmLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlarmLifeline} proxy from a {@link Lifeline} stereotyped << Alarm_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link AlarmLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3f4834d8-105c-45fd-8c60-9dc5a7831655")
    public static AlarmLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (AlarmLifeline.canInstantiate(obj))
        	return new AlarmLifeline(obj);
        else
        	throw new IllegalArgumentException("AlarmLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1b4eacf2-f9d5-4b29-8b39-275a103508f2")
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
        AlarmLifeline other = (AlarmLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Alarm_Lifeline_timers'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("04b72e01-bee3-4190-8211-0ddfbd578be9")
    public List<String> getAlarm_Lifeline_timers() {
        return this.elt.getTagValues(AlarmLifeline.MdaTypes.ALARM_LIFELINE_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("e6d06669-021a-44d8-ada8-a1859d7504ea")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("155f3917-777d-4943-88c9-975c7139fa6b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Lifeline_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b17fea22-23b8-4099-bce9-ac963f506d56")
    public boolean isAlarm_Lifeline_isWatchdog() {
        return this.elt.isTagged(AlarmLifeline.MdaTypes.ALARM_LIFELINE_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Lifeline_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f25ae222-fb19-438e-82b1-5ac330297b37")
    public void setAlarm_Lifeline_isWatchdog(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AlarmLifeline.MdaTypes.ALARM_LIFELINE_ISWATCHDOG_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AlarmLifeline.MdaTypes.ALARM_LIFELINE_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'Alarm_Lifeline_timers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28ab8262-2335-4062-a055-54bd68b32dc0")
    public void setAlarm_Lifeline_timers(final List<String> values) {
        this.elt.putTagValues(AlarmLifeline.MdaTypes.ALARM_LIFELINE_TIMERS_TAGTYPE_ELT, values);
    }

    @objid ("654dd68e-6e0a-4fbf-997d-07c67beac13e")
    protected AlarmLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("582cdbf8-4c35-4400-a81f-dc714c834015")
    public static final class MdaTypes {
        @objid ("5819d853-ecdb-4074-ac6f-ec6784fc79d3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("78b41aaf-8a37-484e-ab27-9acc166758b8")
        public static TagType ALARM_LIFELINE_ISWATCHDOG_TAGTYPE_ELT;

        @objid ("1ae6c8dc-1c63-4a5e-a03b-18726c36418c")
        public static TagType ALARM_LIFELINE_TIMERS_TAGTYPE_ELT;

        @objid ("88c63a08-105b-4310-9e3d-7b56c7775684")
        private static Stereotype MDAASSOCDEP;

        @objid ("dae52618-0197-41e3-bede-f6dbd5a9868b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("95c9ba29-565a-4ea4-a11a-e938a6aa0b1d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0182f64a-10d1-11df-81d9-0014222a9f79");
            ALARM_LIFELINE_ISWATCHDOG_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0182f64b-10d1-11df-81d9-0014222a9f79");
            ALARM_LIFELINE_TIMERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0182f64c-10d1-11df-81d9-0014222a9f79");
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
