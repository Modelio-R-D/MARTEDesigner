/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
import org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.behavior.ConfigurationBehavior;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Behavior} with << GaAnalysisContext_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaAnalysisContextBehavior extends ConfigurationBehavior {
    public static final String STEREOTYPE_NAME = "GaAnalysisContext_Behavior";

    public static final String GAANALYSISCONTEXT_BEHAVIOR_CONTEXTPARAMS_TAGTYPE = "GaAnalysisContext_Behavior_contextParams";

    public static final String GAANALYSISCONTEXT_BEHAVIOR_PLATFORM_TAGTYPE = "GaAnalysisContext_Behavior_platform";

    public static final String GAANALYSISCONTEXT_BEHAVIOR_WORKLOAD_TAGTYPE = "GaAnalysisContext_Behavior_workload";

    /**
     * Tells whether a {@link GaAnalysisContextBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << GaAnalysisContext_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << GaAnalysisContext_Behavior >> then instantiate a {@link GaAnalysisContextBehavior} proxy.
     * 
     * @return a {@link GaAnalysisContextBehavior} proxy on the created {@link Behavior}.
     */
    public static GaAnalysisContextBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextBehavior.STEREOTYPE_NAME);
        return GaAnalysisContextBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextBehavior} proxy from a {@link Behavior} stereotyped << GaAnalysisContext_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link GaAnalysisContextBehavior} proxy or <i>null</i>.
     */
    public static GaAnalysisContextBehavior instantiate(final Behavior obj) {
        return GaAnalysisContextBehavior.canInstantiate(obj) ? new GaAnalysisContextBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextBehavior} proxy from a {@link Behavior} stereotyped << GaAnalysisContext_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link GaAnalysisContextBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaAnalysisContextBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (GaAnalysisContextBehavior.canInstantiate(obj))
        	return new GaAnalysisContextBehavior(obj);
        else
        	throw new IllegalArgumentException("GaAnalysisContextBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaAnalysisContextBehavior other = (GaAnalysisContextBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @Override
    public Behavior getElement() {
        return (Behavior)super.getElement();
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Behavior_contextParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaAnalysisContext_Behavior_contextParams() {
        return this.elt.getTagValues(GaAnalysisContextBehavior.MdaTypes.GAANALYSISCONTEXT_BEHAVIOR_CONTEXTPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Behavior_platform'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaAnalysisContext_Behavior_platform() {
        return this.elt.getTagValues(GaAnalysisContextBehavior.MdaTypes.GAANALYSISCONTEXT_BEHAVIOR_PLATFORM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Behavior_workload'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaAnalysisContext_Behavior_workload() {
        return this.elt.getTagValues(GaAnalysisContextBehavior.MdaTypes.GAANALYSISCONTEXT_BEHAVIOR_WORKLOAD_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Behavior_contextParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAnalysisContext_Behavior_contextParams(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextBehavior.MdaTypes.GAANALYSISCONTEXT_BEHAVIOR_CONTEXTPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Behavior_platform'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAnalysisContext_Behavior_platform(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextBehavior.MdaTypes.GAANALYSISCONTEXT_BEHAVIOR_PLATFORM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Behavior_workload'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAnalysisContext_Behavior_workload(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextBehavior.MdaTypes.GAANALYSISCONTEXT_BEHAVIOR_WORKLOAD_TAGTYPE_ELT, values);
    }

    protected GaAnalysisContextBehavior(final Behavior elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GAANALYSISCONTEXT_BEHAVIOR_CONTEXTPARAMS_TAGTYPE_ELT;

        public static TagType GAANALYSISCONTEXT_BEHAVIOR_WORKLOAD_TAGTYPE_ELT;

        public static TagType GAANALYSISCONTEXT_BEHAVIOR_PLATFORM_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "427471ad-149f-11df-9d54-0014222a9f79");
            GAANALYSISCONTEXT_BEHAVIOR_CONTEXTPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "427471ae-149f-11df-9d54-0014222a9f79");
            GAANALYSISCONTEXT_BEHAVIOR_WORKLOAD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "427471af-149f-11df-9d54-0014222a9f79");
            GAANALYSISCONTEXT_BEHAVIOR_PLATFORM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "427471b0-149f-11df-9d54-0014222a9f79");
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
