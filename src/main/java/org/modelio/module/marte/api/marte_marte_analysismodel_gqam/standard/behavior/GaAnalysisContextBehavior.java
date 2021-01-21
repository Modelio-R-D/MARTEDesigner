/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.behavior.ConfigurationBehavior;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Behavior} with << GaAnalysisContext_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a4edbb5b-1c81-417b-b7e2-acab31f4fcff")
public class GaAnalysisContextBehavior extends ConfigurationBehavior {
    @objid ("ae930af5-714e-4207-be86-0812b0de16cc")
    public static final String STEREOTYPE_NAME = "GaAnalysisContext_Behavior";

    @objid ("de8164be-be79-4ec4-853c-d3c0176955c4")
    public static final String GAANALYSISCONTEXT_BEHAVIOR_CONTEXTPARAMS_TAGTYPE = "GaAnalysisContext_Behavior_contextParams";

    @objid ("9be59f3a-73ad-42fe-94f1-53f3238cca2a")
    public static final String GAANALYSISCONTEXT_BEHAVIOR_PLATFORM_TAGTYPE = "GaAnalysisContext_Behavior_platform";

    @objid ("3dfb50e0-37d7-4d3a-96a7-2367f7c92aac")
    public static final String GAANALYSISCONTEXT_BEHAVIOR_WORKLOAD_TAGTYPE = "GaAnalysisContext_Behavior_workload";

    /**
     * Tells whether a {@link GaAnalysisContextBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << GaAnalysisContext_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4e99d854-3108-4c47-871a-72087865ae19")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << GaAnalysisContext_Behavior >> then instantiate a {@link GaAnalysisContextBehavior} proxy.
     * 
     * @return a {@link GaAnalysisContextBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("85b143cd-f522-4a1f-a4ec-308f5736769c")
    public static GaAnalysisContextBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextBehavior.STEREOTYPE_NAME);
        return GaAnalysisContextBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextBehavior} proxy from a {@link Behavior} stereotyped << GaAnalysisContext_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link GaAnalysisContextBehavior} proxy or <i>null</i>.
     */
    @objid ("16b0aeff-f014-4c4b-967a-d5a230bc30bf")
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
    @objid ("8befb87f-793f-4ed6-a0e3-39c7b5991627")
    public static GaAnalysisContextBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (GaAnalysisContextBehavior.canInstantiate(obj))
        	return new GaAnalysisContextBehavior(obj);
        else
        	throw new IllegalArgumentException("GaAnalysisContextBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c944c30e-22ba-42c6-a4f4-d26daf9c3544")
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
    @objid ("7177016a-1f9b-4414-9647-246ccd2de724")
    @Override
    public Behavior getElement() {
        return (Behavior)super.getElement();
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Behavior_contextParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f4aafdad-847f-4f03-b866-11a8fed8cd21")
    public List<String> getGaAnalysisContext_Behavior_contextParams() {
        return this.elt.getTagValues(GaAnalysisContextBehavior.MdaTypes.GAANALYSISCONTEXT_BEHAVIOR_CONTEXTPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Behavior_platform'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f89254e2-fb25-446a-976b-7c8e25e9b354")
    public List<String> getGaAnalysisContext_Behavior_platform() {
        return this.elt.getTagValues(GaAnalysisContextBehavior.MdaTypes.GAANALYSISCONTEXT_BEHAVIOR_PLATFORM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Behavior_workload'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("eab67d8b-b10f-49c6-ad52-458b4c4c8a4d")
    public List<String> getGaAnalysisContext_Behavior_workload() {
        return this.elt.getTagValues(GaAnalysisContextBehavior.MdaTypes.GAANALYSISCONTEXT_BEHAVIOR_WORKLOAD_TAGTYPE_ELT);
    }

    @objid ("e2627747-e931-4f7a-874d-599109a102ca")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Behavior_contextParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("946b8f41-4f62-47c4-8a3b-bbb152059cd9")
    public void setGaAnalysisContext_Behavior_contextParams(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextBehavior.MdaTypes.GAANALYSISCONTEXT_BEHAVIOR_CONTEXTPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Behavior_platform'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a81d7fc9-5b2b-4290-b53a-db20703d7c7c")
    public void setGaAnalysisContext_Behavior_platform(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextBehavior.MdaTypes.GAANALYSISCONTEXT_BEHAVIOR_PLATFORM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Behavior_workload'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e566e65b-1f55-4c3f-bb9e-6d71fa9b844c")
    public void setGaAnalysisContext_Behavior_workload(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextBehavior.MdaTypes.GAANALYSISCONTEXT_BEHAVIOR_WORKLOAD_TAGTYPE_ELT, values);
    }

    @objid ("e8b33844-0f8e-4363-afa3-20507e75287d")
    protected GaAnalysisContextBehavior(final Behavior elt) {
        super(elt);
    }

    @objid ("6ae66fff-ad49-4437-af09-beec0a2fab27")
    public static final class MdaTypes {
        @objid ("cb015d3f-ffbb-4419-aad9-6dc0c1b49b4d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("706eeacb-476d-4ac1-b6c7-7b355825f5e5")
        public static TagType GAANALYSISCONTEXT_BEHAVIOR_CONTEXTPARAMS_TAGTYPE_ELT;

        @objid ("8886338e-81c4-4891-aebe-c40ecf4ea45a")
        public static TagType GAANALYSISCONTEXT_BEHAVIOR_WORKLOAD_TAGTYPE_ELT;

        @objid ("9d82117a-e8b7-4b6b-93ac-529b50f8d180")
        public static TagType GAANALYSISCONTEXT_BEHAVIOR_PLATFORM_TAGTYPE_ELT;

        @objid ("c6b10d84-3436-45e3-a81e-c0355a0b8d1d")
        private static Stereotype MDAASSOCDEP;

        @objid ("9b006cb2-d132-48ee-a4b6-0ac4ba1f43af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bd2e3755-bb6c-431f-a291-a20496f7c996")
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
