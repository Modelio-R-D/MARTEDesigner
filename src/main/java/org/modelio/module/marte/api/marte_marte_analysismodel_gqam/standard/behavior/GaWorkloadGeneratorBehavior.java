/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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
 * Proxy class to handle a {@link Behavior} with << GaWorkloadGenerator_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("83769534-25bc-4f0e-bc9d-e5e705e084a5")
public class GaWorkloadGeneratorBehavior {
    @objid ("5ff12110-2362-42eb-a87b-fa4d3e2eb7be")
    public static final String STEREOTYPE_NAME = "GaWorkloadGenerator_Behavior";

    @objid ("a8ad85c0-d899-41c8-aa63-9f1ab1acef3d")
    public static final String GAWORKLOADGENERATOR_BEHAVIOR_POP_TAGTYPE = "GaWorkloadGenerator_Behavior_pop";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    @objid ("4ba0d0eb-82f3-444a-a522-ab9f4f9bed0a")
    protected final Behavior elt;

    /**
     * Tells whether a {@link GaWorkloadGeneratorBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << GaWorkloadGenerator_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("024d5ab5-10e6-4174-bba9-5739e2a8ff01")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaWorkloadGeneratorBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << GaWorkloadGenerator_Behavior >> then instantiate a {@link GaWorkloadGeneratorBehavior} proxy.
     * 
     * @return a {@link GaWorkloadGeneratorBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("5400a5c9-f26a-4bff-baf8-811ca5a3d17f")
    public static GaWorkloadGeneratorBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaWorkloadGeneratorBehavior.STEREOTYPE_NAME);
        return GaWorkloadGeneratorBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link GaWorkloadGeneratorBehavior} proxy from a {@link Behavior} stereotyped << GaWorkloadGenerator_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link GaWorkloadGeneratorBehavior} proxy or <i>null</i>.
     */
    @objid ("e9bcca64-da2c-4064-8278-afbb830549c7")
    public static GaWorkloadGeneratorBehavior instantiate(final Behavior obj) {
        return GaWorkloadGeneratorBehavior.canInstantiate(obj) ? new GaWorkloadGeneratorBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaWorkloadGeneratorBehavior} proxy from a {@link Behavior} stereotyped << GaWorkloadGenerator_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link GaWorkloadGeneratorBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("55b1a9d7-556e-43c3-9b0a-ea7c557e4eee")
    public static GaWorkloadGeneratorBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (GaWorkloadGeneratorBehavior.canInstantiate(obj))
        	return new GaWorkloadGeneratorBehavior(obj);
        else
        	throw new IllegalArgumentException("GaWorkloadGeneratorBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("32d113f8-7cd4-4359-a5e8-ad7e4307eda1")
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
        GaWorkloadGeneratorBehavior other = (GaWorkloadGeneratorBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @objid ("2aca27b8-2809-4ae4-accd-a438f6c231fa")
    public Behavior getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GaWorkloadGenerator_Behavior_pop'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d46fccfd-80f3-44df-afba-c2b5beeeb0ec")
    public String getGaWorkloadGenerator_Behavior_pop() {
        return this.elt.getTagValue(GaWorkloadGeneratorBehavior.MdaTypes.GAWORKLOADGENERATOR_BEHAVIOR_POP_TAGTYPE_ELT);
    }

    @objid ("c7c79775-1d06-4c01-a5dd-f98b96eab91a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaWorkloadGenerator_Behavior_pop'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e0c91a0-52d7-473e-8a6e-43c131410ab7")
    public void setGaWorkloadGenerator_Behavior_pop(final String value) {
        this.elt.putTagValue(GaWorkloadGeneratorBehavior.MdaTypes.GAWORKLOADGENERATOR_BEHAVIOR_POP_TAGTYPE_ELT, value);
    }

    @objid ("a87ecd15-d8d7-4d4c-aa24-374a50c2c539")
    protected GaWorkloadGeneratorBehavior(final Behavior elt) {
        this.elt = elt;
    }

    @objid ("0c5f6dab-f47a-49bc-8e90-cd786a5454d9")
    public static final class MdaTypes {
        @objid ("a77bbd40-f811-4a41-8322-3e84d7833156")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9af02a22-7bc7-4c40-ba9b-541e0c406b13")
        public static TagType GAWORKLOADGENERATOR_BEHAVIOR_POP_TAGTYPE_ELT;

        @objid ("8a1c87cb-7ccd-42d0-881e-1902704f5b27")
        private static Stereotype MDAASSOCDEP;

        @objid ("6e7a09eb-d583-4d9d-a288-b5fea08a3c07")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0f10a6bd-916b-4e16-9175-cbb23eb7e689")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0266a4a0-0ccf-11df-8525-001302895b2b");
            GAWORKLOADGENERATOR_BEHAVIOR_POP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0266a4a1-0ccf-11df-8525-001302895b2b");
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
