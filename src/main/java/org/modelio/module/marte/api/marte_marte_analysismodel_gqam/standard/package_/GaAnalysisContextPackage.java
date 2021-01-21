/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.package_;

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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.package_.ConfigurationPackage;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << GaAnalysisContext_Package >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0aff3fb8-eeb0-4ef7-bbd2-d819175d05ae")
public class GaAnalysisContextPackage extends ConfigurationPackage {
    @objid ("a8da92e3-9769-4dbd-a3a2-f35a2d2e35fe")
    public static final String STEREOTYPE_NAME = "GaAnalysisContext_Package";

    @objid ("f28cccf2-07b3-4e95-9a65-ce6583807a94")
    public static final String GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS_TAGTYPE = "GaAnalysisContext_Package_contextParams";

    @objid ("4e01dfa5-c18b-4c7f-942f-825de84a8915")
    public static final String GAANALYSISCONTEXT_PACKAGE_PLATFORM_TAGTYPE = "GaAnalysisContext_Package_platform";

    @objid ("d91cf1bd-c157-4852-a530-fa062fc87b6d")
    public static final String GAANALYSISCONTEXT_PACKAGE_WORKLOAD_TAGTYPE = "GaAnalysisContext_Package_workload";

    /**
     * Tells whether a {@link GaAnalysisContextPackage proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << GaAnalysisContext_Package >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1d9fb51a-2879-4f35-978e-f4859c5e732d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextPackage.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << GaAnalysisContext_Package >> then instantiate a {@link GaAnalysisContextPackage} proxy.
     * 
     * @return a {@link GaAnalysisContextPackage} proxy on the created {@link Package}.
     */
    @objid ("56f68031-80bb-47a1-a333-ccf9c1e42459")
    public static GaAnalysisContextPackage create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Package");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextPackage.STEREOTYPE_NAME);
        return GaAnalysisContextPackage.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextPackage} proxy from a {@link Package} stereotyped << GaAnalysisContext_Package >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link GaAnalysisContextPackage} proxy or <i>null</i>.
     */
    @objid ("b8bb85b6-4a75-4976-88cf-ee2b7dd01e6a")
    public static GaAnalysisContextPackage instantiate(final Package obj) {
        return GaAnalysisContextPackage.canInstantiate(obj) ? new GaAnalysisContextPackage(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextPackage} proxy from a {@link Package} stereotyped << GaAnalysisContext_Package >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link GaAnalysisContextPackage} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("47c5ca6c-bfd4-43a1-ab5a-7af2983e90f5")
    public static GaAnalysisContextPackage safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (GaAnalysisContextPackage.canInstantiate(obj))
        	return new GaAnalysisContextPackage(obj);
        else
        	throw new IllegalArgumentException("GaAnalysisContextPackage: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bd84b0d9-e8b3-447b-b26d-7dae4e20e03d")
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
        GaAnalysisContextPackage other = (GaAnalysisContextPackage) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("f2f45b2b-73ef-4ec4-8d6b-3225545b40d3")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Package_contextParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8b2e3bf7-a0c9-4373-9caf-4d2af73c49e2")
    public List<String> getGaAnalysisContext_Package_contextParams() {
        return this.elt.getTagValues(GaAnalysisContextPackage.MdaTypes.GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Package_platform'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ecc42f44-8d0a-4f29-9c19-2b8ba6345b38")
    public List<String> getGaAnalysisContext_Package_platform() {
        return this.elt.getTagValues(GaAnalysisContextPackage.MdaTypes.GAANALYSISCONTEXT_PACKAGE_PLATFORM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Package_workload'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5628b8f5-e1dc-4074-8732-4f6955e526bb")
    public List<String> getGaAnalysisContext_Package_workload() {
        return this.elt.getTagValues(GaAnalysisContextPackage.MdaTypes.GAANALYSISCONTEXT_PACKAGE_WORKLOAD_TAGTYPE_ELT);
    }

    @objid ("6827b3d2-2f97-48bc-a93f-7fb139445c4a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Package_contextParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d5590bb-6222-413b-98d8-c18865d57737")
    public void setGaAnalysisContext_Package_contextParams(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextPackage.MdaTypes.GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Package_platform'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c4b1638-afcf-4b02-b87b-490de4d0a20e")
    public void setGaAnalysisContext_Package_platform(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextPackage.MdaTypes.GAANALYSISCONTEXT_PACKAGE_PLATFORM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Package_workload'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("177ce63a-0a02-4b71-98d0-88415f955660")
    public void setGaAnalysisContext_Package_workload(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextPackage.MdaTypes.GAANALYSISCONTEXT_PACKAGE_WORKLOAD_TAGTYPE_ELT, values);
    }

    @objid ("e158b314-e2d4-4bad-9981-53d257126d1a")
    protected GaAnalysisContextPackage(final Package elt) {
        super(elt);
    }

    @objid ("31fbb5ad-cc93-474f-8c4f-46d281cca677")
    public static final class MdaTypes {
        @objid ("c82f6cf9-4939-4600-821f-f8dd8f45625e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8fb6b99b-f85d-42ed-a8f5-e63945a6d882")
        public static TagType GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS_TAGTYPE_ELT;

        @objid ("4469d753-7137-4bc0-8864-6bb3d546959d")
        public static TagType GAANALYSISCONTEXT_PACKAGE_WORKLOAD_TAGTYPE_ELT;

        @objid ("48604e76-a999-4cfc-a813-299b38af7061")
        public static TagType GAANALYSISCONTEXT_PACKAGE_PLATFORM_TAGTYPE_ELT;

        @objid ("b1b90f8a-6df0-4341-8d23-f160143d5f6a")
        private static Stereotype MDAASSOCDEP;

        @objid ("8d6cd983-8f5e-43a3-90eb-52c40bcef799")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d496aa0b-294f-4eb6-a481-946b982d4d3a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "037ff66e-0ccf-11df-8525-001302895b2b");
            GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "037ff670-0ccf-11df-8525-001302895b2b");
            GAANALYSISCONTEXT_PACKAGE_WORKLOAD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "037ff672-0ccf-11df-8525-001302895b2b");
            GAANALYSISCONTEXT_PACKAGE_PLATFORM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "037ff674-0ccf-11df-8525-001302895b2b");
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
