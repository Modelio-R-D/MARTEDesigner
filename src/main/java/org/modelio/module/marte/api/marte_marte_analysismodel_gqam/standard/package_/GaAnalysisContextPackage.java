/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.package_;

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
public class GaAnalysisContextPackage extends ConfigurationPackage {
    public static final String STEREOTYPE_NAME = "GaAnalysisContext_Package";

    public static final String GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS_TAGTYPE = "GaAnalysisContext_Package_contextParams";

    public static final String GAANALYSISCONTEXT_PACKAGE_PLATFORM_TAGTYPE = "GaAnalysisContext_Package_platform";

    public static final String GAANALYSISCONTEXT_PACKAGE_WORKLOAD_TAGTYPE = "GaAnalysisContext_Package_workload";

    /**
     * Tells whether a {@link GaAnalysisContextPackage proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << GaAnalysisContext_Package >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextPackage.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << GaAnalysisContext_Package >> then instantiate a {@link GaAnalysisContextPackage} proxy.
     * 
     * @return a {@link GaAnalysisContextPackage} proxy on the created {@link Package}.
     */
    public static GaAnalysisContextPackage create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaAnalysisContextPackage.STEREOTYPE_NAME);
        return GaAnalysisContextPackage.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link GaAnalysisContextPackage} proxy from a {@link Package} stereotyped << GaAnalysisContext_Package >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link GaAnalysisContextPackage} proxy or <i>null</i>.
     */
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
    public static GaAnalysisContextPackage safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (GaAnalysisContextPackage.canInstantiate(obj))
        	return new GaAnalysisContextPackage(obj);
        else
        	throw new IllegalArgumentException("GaAnalysisContextPackage: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaAnalysisContextPackage other = (GaAnalysisContextPackage) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Package_contextParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaAnalysisContext_Package_contextParams() {
        return this.elt.getTagValues(GaAnalysisContextPackage.MdaTypes.GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Package_platform'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaAnalysisContext_Package_platform() {
        return this.elt.getTagValues(GaAnalysisContextPackage.MdaTypes.GAANALYSISCONTEXT_PACKAGE_PLATFORM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaAnalysisContext_Package_workload'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaAnalysisContext_Package_workload() {
        return this.elt.getTagValues(GaAnalysisContextPackage.MdaTypes.GAANALYSISCONTEXT_PACKAGE_WORKLOAD_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Package_contextParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAnalysisContext_Package_contextParams(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextPackage.MdaTypes.GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Package_platform'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAnalysisContext_Package_platform(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextPackage.MdaTypes.GAANALYSISCONTEXT_PACKAGE_PLATFORM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaAnalysisContext_Package_workload'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAnalysisContext_Package_workload(final List<String> values) {
        this.elt.putTagValues(GaAnalysisContextPackage.MdaTypes.GAANALYSISCONTEXT_PACKAGE_WORKLOAD_TAGTYPE_ELT, values);
    }

    protected GaAnalysisContextPackage(final Package elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS_TAGTYPE_ELT;

        public static TagType GAANALYSISCONTEXT_PACKAGE_WORKLOAD_TAGTYPE_ELT;

        public static TagType GAANALYSISCONTEXT_PACKAGE_PLATFORM_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
