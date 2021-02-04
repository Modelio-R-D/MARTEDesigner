/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("4a8c15cf-6b0a-4b7e-a287-a2a3718ee9c9")
    public static final String STEREOTYPE_NAME = "SecondaryScheduler_Lifeline";

    @objid ("399348a3-810e-4d16-8e6f-7d62cdc0d24c")
    public static final String SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS_TAGTYPE = "SecondaryScheduler_Lifeline_virtualProcessingUnits";

    /**
     * Tells whether a {@link SecondarySchedulerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SecondaryScheduler_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fac108af-0c57-4e1b-80fd-a79edbe29b59")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SecondaryScheduler_Lifeline >> then instantiate a {@link SecondarySchedulerLifeline} proxy.
     * 
     * @return a {@link SecondarySchedulerLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("77f3343d-82e2-4e43-a785-4954eda8842c")
    public static SecondarySchedulerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerLifeline.STEREOTYPE_NAME);
        return SecondarySchedulerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerLifeline} proxy from a {@link Lifeline} stereotyped << SecondaryScheduler_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SecondarySchedulerLifeline} proxy or <i>null</i>.
     */
    @objid ("8cfffddf-c7e1-4448-aeed-99e84737b8d1")
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
    @objid ("44a95602-62d6-4acb-a99f-561146697b6f")
    public static SecondarySchedulerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SecondarySchedulerLifeline.canInstantiate(obj))
        	return new SecondarySchedulerLifeline(obj);
        else
        	throw new IllegalArgumentException("SecondarySchedulerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("daebb0a9-bc1c-4bfd-a883-75aed3348bb5")
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
    @objid ("b373f0fb-5e80-4c3a-8c3d-501e8cfeecd2")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SecondaryScheduler_Lifeline_virtualProcessingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d9dfd9ee-d1c8-4ae7-8c88-6f3e81cd5feb")
    public List<String> getSecondaryScheduler_Lifeline_virtualProcessingUnits() {
        return this.elt.getTagValues(SecondarySchedulerLifeline.MdaTypes.SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT);
    }

    @objid ("c64834b5-7497-4e2c-b088-036c9faec957")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SecondaryScheduler_Lifeline_virtualProcessingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("93ea5c28-f83d-48a1-a9b2-3db33d9e6b16")
    public void setSecondaryScheduler_Lifeline_virtualProcessingUnits(final List<String> values) {
        this.elt.putTagValues(SecondarySchedulerLifeline.MdaTypes.SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    @objid ("35507679-e63a-4620-9270-a4b8f5f5a121")
    protected SecondarySchedulerLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("efd5560c-3385-418e-9b6c-de461d7c3fe0")
    public static final class MdaTypes {
        @objid ("dece0815-ad3e-45c0-852f-5130ac3f1c46")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d85408ec-199f-40ac-8783-77fc308da6e8")
        public static TagType SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("999f342e-b6de-45e7-8e9f-94f7e51734bd")
        private static Stereotype MDAASSOCDEP;

        @objid ("f4f5c581-ca4c-4dd5-a347-e09f3abf342e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("92ec5d6a-57b2-41cb-88a3-570ed9234fd2")
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
