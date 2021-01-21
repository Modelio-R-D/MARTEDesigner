/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << SecondaryScheduler_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e20fb6e3-b6e8-4039-92d7-f407c3dcaae4")
public class SecondarySchedulerLifeline extends SchedulerLifeline {
    @objid ("4249bc7f-6345-458f-b15d-5e8faf40cba6")
    public static final String STEREOTYPE_NAME = "SecondaryScheduler_Lifeline";

    @objid ("03eebc8d-3283-4f1b-ab16-d8367e11a9bb")
    public static final String SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS_TAGTYPE = "SecondaryScheduler_Lifeline_virtualProcessingUnits";

    /**
     * Tells whether a {@link SecondarySchedulerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SecondaryScheduler_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("cc88b766-4502-40c8-934d-797f1bd41a98")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SecondaryScheduler_Lifeline >> then instantiate a {@link SecondarySchedulerLifeline} proxy.
     * 
     * @return a {@link SecondarySchedulerLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("9207e4e6-3b24-4d12-af57-ceb529707802")
    public static SecondarySchedulerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerLifeline.STEREOTYPE_NAME);
        return SecondarySchedulerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerLifeline} proxy from a {@link Lifeline} stereotyped << SecondaryScheduler_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SecondarySchedulerLifeline} proxy or <i>null</i>.
     */
    @objid ("5dc619dd-098a-4457-84e7-5f12e5d15eb2")
    public static SecondarySchedulerLifeline instantiate(final Lifeline obj) {
        return SecondarySchedulerLifeline.canInstantiate(obj) ? new SecondarySchedulerLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerLifeline} proxy from a {@link Lifeline} stereotyped << SecondaryScheduler_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SecondarySchedulerLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2bdf9a55-0ac2-4b6e-b91a-da989a4feb52")
    public static SecondarySchedulerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SecondarySchedulerLifeline.canInstantiate(obj))
        	return new SecondarySchedulerLifeline(obj);
        else
        	throw new IllegalArgumentException("SecondarySchedulerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5ccbfa18-2660-402a-b008-610cc81e3077")
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
        SecondarySchedulerLifeline other = (SecondarySchedulerLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("3a3f67cd-ac1c-4ec7-b505-db1f426e20bf")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SecondaryScheduler_Lifeline_virtualProcessingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("92ccbe1e-1524-45ba-8549-ffde18595759")
    public List<String> getSecondaryScheduler_Lifeline_virtualProcessingUnits() {
        return this.elt.getTagValues(SecondarySchedulerLifeline.MdaTypes.SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT);
    }

    @objid ("afe992a4-8f91-4bd4-9493-3eb5687b090a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SecondaryScheduler_Lifeline_virtualProcessingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5aa5edb2-1912-4b5b-8080-04d21f9c53f5")
    public void setSecondaryScheduler_Lifeline_virtualProcessingUnits(final List<String> values) {
        this.elt.putTagValues(SecondarySchedulerLifeline.MdaTypes.SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    @objid ("7f0bd2b7-ba70-47c5-841f-5700b7672e0d")
    protected SecondarySchedulerLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("efd5560c-3385-418e-9b6c-de461d7c3fe0")
    public static final class MdaTypes {
        @objid ("05a78b2e-db98-4809-9112-56d4cf38f663")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fff1f2a4-4c5a-4f48-8b35-1aecf6a1b880")
        public static TagType SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("99b76377-d90a-45e7-9176-c2ce52df869a")
        private static Stereotype MDAASSOCDEP;

        @objid ("fdd46014-1fe6-4c47-89e5-849e77aae062")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1e726bfa-06e9-443c-b682-f010e5d2b2fe")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "002f3c66-0ccf-11df-8525-001302895b2b");
            SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76c18dfb-16fa-11df-b92a-0014222a9f79");
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
