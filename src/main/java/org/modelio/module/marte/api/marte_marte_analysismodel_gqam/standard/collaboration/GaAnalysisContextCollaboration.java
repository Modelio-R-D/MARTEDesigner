/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.collaboration;

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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.collaboration.ConfigurationCollaboration;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Collaboration} with << GaAnalysisContext_Collaboration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2e8a3403-fced-4fa7-a404-edae18df7063")
public class GaAnalysisContextCollaboration extends ConfigurationCollaboration {
    @objid ("40cb7157-e33e-4221-ab55-6fd0245139e3")
    public static final String STEREOTYPE_NAME = "GaAnalysisContext_Collaboration";

    @objid ("1d786a63-a9da-43c3-8ccf-05b18d83e45f")
    public static final String GAANALYSISCONTEXT_COLLABORATION_CONTEXTPARAMS_TAGTYPE = "GaAnalysisContext_Collaboration_contextParams";

    @objid ("35160295-759c-4c5d-992e-3b26d5fbf55d")
    public static final String GAANALYSISCONTEXT_COLLABORATION_PLATFORM_TAGTYPE = "GaAnalysisContext_Collaboration_platform";

    @objid ("6b26e67d-2650-4580-b98a-c550c544ba07")
    public static final String GAANALYSISCONTEXT_COLLABORATION_WORKLOAD_TAGTYPE = "GaAnalysisContext_Collaboration_workload";

    /**
     * Tells whether a {@link GaAnalysisContextCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << GaAnalysisContext_Collaboration >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ed7c25d8-06d5-4e17-a6de-d8462950f8d1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << GaAnalysisContext_Collaboration >> then instantiate a {@link GaAnalysisContextCollaboration} proxy.
     * 
     * @return a {@link GaAnalysisContextCollaboration} proxy on the created {@link Collaboration}.
     */
    @objid ("012f38e8-2f9e-454a-a611-a917668c810b")
    public static GaAnalysisContextCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextCollaboration.STEREOTYPE_NAME);
        return GaAnalysisContextCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextCollaboration} proxy from a {@link Collaboration} stereotyped << GaAnalysisContext_Collaboration >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link GaAnalysisContextCollaboration} proxy or <i>null</i>.
     */
    @objid ("cea89e55-ecf7-42be-a988-c4a4b3fd6f93")
    public static GaAnalysisContextCollaboration instantiate(final Collaboration obj) {
        return GaAnalysisContextCollaboration.canInstantiate(obj) ? new GaAnalysisContextCollaboration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextCollaboration} proxy from a {@link Collaboration} stereotyped << GaAnalysisContext_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Collaboration}
     * @return a {@link GaAnalysisContextCollaboration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("81ea8aea-8553-40c9-9079-2aa4278b212c")
    public static GaAnalysisContextCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (GaAnalysisContextCollaboration.canInstantiate(obj))
        	return new GaAnalysisContextCollaboration(obj);
        else
        	throw new IllegalArgumentException("GaAnalysisContextCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8dcd74e1-622c-4a1e-bc97-a2ce99232a2f")
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
        GaAnalysisContextCollaboration other = (GaAnalysisContextCollaboration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    @objid ("388182b2-808e-4862-93d3-62c6e5ca0e6b")
    @Override
    public Collaboration getElement() {
        return (Collaboration)super.getElement();
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Collaboration_contextParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("01b243a7-db8e-45e1-ac4e-c000105de4d6")
    public List<String> getGaAnalysisContext_Collaboration_contextParams() {
        return this.elt.getTagValues(GaAnalysisContextCollaboration.MdaTypes.GAANALYSISCONTEXT_COLLABORATION_CONTEXTPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Collaboration_platform'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c91b1a4c-a5b4-4200-a828-0bef2c64df6c")
    public List<String> getGaAnalysisContext_Collaboration_platform() {
        return this.elt.getTagValues(GaAnalysisContextCollaboration.MdaTypes.GAANALYSISCONTEXT_COLLABORATION_PLATFORM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Collaboration_workload'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f4731462-91c9-4f11-85b7-e0fc1440a968")
    public List<String> getGaAnalysisContext_Collaboration_workload() {
        return this.elt.getTagValues(GaAnalysisContextCollaboration.MdaTypes.GAANALYSISCONTEXT_COLLABORATION_WORKLOAD_TAGTYPE_ELT);
    }

    @objid ("b19e609b-fe4e-4e9a-990b-cfe881dfdb74")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Collaboration_contextParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cee55fb1-97f5-4ca2-9453-aa34246632ad")
    public void setGaAnalysisContext_Collaboration_contextParams(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextCollaboration.MdaTypes.GAANALYSISCONTEXT_COLLABORATION_CONTEXTPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Collaboration_platform'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6de7f4c1-6e0c-479d-b0ea-11eed9939080")
    public void setGaAnalysisContext_Collaboration_platform(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextCollaboration.MdaTypes.GAANALYSISCONTEXT_COLLABORATION_PLATFORM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Collaboration_workload'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9bd73d80-7ccf-492e-be04-cdd8db7e0900")
    public void setGaAnalysisContext_Collaboration_workload(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextCollaboration.MdaTypes.GAANALYSISCONTEXT_COLLABORATION_WORKLOAD_TAGTYPE_ELT, values);
    }

    @objid ("b5897fc6-32a1-4613-acb5-c015ad739902")
    protected GaAnalysisContextCollaboration(final Collaboration elt) {
        super(elt);
    }

    @objid ("5d054aa1-3fc8-4d08-811c-83ab3f6631b1")
    public static final class MdaTypes {
        @objid ("fa769b88-b4d8-4008-8efd-f1df946d12b3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f62cdf0e-8dfe-4907-a8a5-6ca0611bda16")
        public static TagType GAANALYSISCONTEXT_COLLABORATION_CONTEXTPARAMS_TAGTYPE_ELT;

        @objid ("c6c7538c-73dc-40a6-b183-36ec9cfee995")
        public static TagType GAANALYSISCONTEXT_COLLABORATION_WORKLOAD_TAGTYPE_ELT;

        @objid ("0b656a9a-ad69-42bd-8515-96b68e7b6b40")
        public static TagType GAANALYSISCONTEXT_COLLABORATION_PLATFORM_TAGTYPE_ELT;

        @objid ("fb9d10cb-de0a-4a10-b91c-02dd9c365a80")
        private static Stereotype MDAASSOCDEP;

        @objid ("cd6ab59d-3895-4147-87f2-115348e640af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ca0927a8-ec2a-443d-8276-aea4ffd2bcef")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "037ff66c-0ccf-11df-8525-001302895b2b");
            GAANALYSISCONTEXT_COLLABORATION_CONTEXTPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "037ff66f-0ccf-11df-8525-001302895b2b");
            GAANALYSISCONTEXT_COLLABORATION_WORKLOAD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "037ff671-0ccf-11df-8525-001302895b2b");
            GAANALYSISCONTEXT_COLLABORATION_PLATFORM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "037ff673-0ccf-11df-8525-001302895b2b");
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
