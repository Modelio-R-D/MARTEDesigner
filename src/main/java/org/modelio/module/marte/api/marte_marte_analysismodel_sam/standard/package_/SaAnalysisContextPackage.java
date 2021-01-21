/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.package_.GaAnalysisContextPackage;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << SaAnalysisContext_Package >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("36c82a0d-46fc-422a-a7d2-17bc0106c3a2")
public class SaAnalysisContextPackage extends GaAnalysisContextPackage {
    @objid ("19f7b2f9-5a73-4a07-9fee-d1b39525332d")
    public static final String STEREOTYPE_NAME = "SaAnalysisContext_Package";

    @objid ("43147e51-e88d-4a7e-afa5-f82e110cce37")
    public static final String SAANALYSISCONTEXT_PACKAGE_ISSCHED_TAGTYPE = "SaAnalysisContext_Package_isSched";

    @objid ("c5b5ccf5-8630-4afc-b673-842ebb0815ac")
    public static final String SAANALYSISCONTEXT_PACKAGE_OPTCRITERION_TAGTYPE = "SaAnalysisContext_Package_optCriterion";

    /**
     * Tells whether a {@link SaAnalysisContextPackage proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << SaAnalysisContext_Package >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("187fa281-ab0f-49d7-af73-5503ab17554b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextPackage.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << SaAnalysisContext_Package >> then instantiate a {@link SaAnalysisContextPackage} proxy.
     * 
     * @return a {@link SaAnalysisContextPackage} proxy on the created {@link Package}.
     */
    @objid ("a41aae30-75aa-4827-90a1-1bb68b5bcdbb")
    public static SaAnalysisContextPackage create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Package");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextPackage.STEREOTYPE_NAME);
        return SaAnalysisContextPackage.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextPackage} proxy from a {@link Package} stereotyped << SaAnalysisContext_Package >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link SaAnalysisContextPackage} proxy or <i>null</i>.
     */
    @objid ("1945ebfc-7637-49fe-9b9a-1fafc7ea50a8")
    public static SaAnalysisContextPackage instantiate(final Package obj) {
        return SaAnalysisContextPackage.canInstantiate(obj) ? new SaAnalysisContextPackage(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextPackage} proxy from a {@link Package} stereotyped << SaAnalysisContext_Package >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link SaAnalysisContextPackage} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9f253f81-8092-4183-9e0a-878f91d7d025")
    public static SaAnalysisContextPackage safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (SaAnalysisContextPackage.canInstantiate(obj))
        	return new SaAnalysisContextPackage(obj);
        else
        	throw new IllegalArgumentException("SaAnalysisContextPackage: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a5500993-c90c-410c-a1ff-7ae4d5b364d8")
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
        SaAnalysisContextPackage other = (SaAnalysisContextPackage) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("0c8c3bac-029c-4e7c-acbc-442df09a0791")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Getter for string property 'SaAnalysisContext_Package_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1539e738-645e-4464-96a6-5a7487bc09be")
    public String getSaAnalysisContext_Package_optCriterion() {
        return this.elt.getTagValue(SaAnalysisContextPackage.MdaTypes.SAANALYSISCONTEXT_PACKAGE_OPTCRITERION_TAGTYPE_ELT);
    }

    @objid ("9191ac95-8259-43b9-9565-91020dee120f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaAnalysisContext_Package_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0810f6c7-bc43-47ec-8bf7-4753729cd128")
    public boolean isSaAnalysisContext_Package_isSched() {
        return this.elt.isTagged(SaAnalysisContextPackage.MdaTypes.SAANALYSISCONTEXT_PACKAGE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaAnalysisContext_Package_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db53b3cb-f421-43f3-a77f-33b83161684b")
    public void setSaAnalysisContext_Package_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaAnalysisContextPackage.MdaTypes.SAANALYSISCONTEXT_PACKAGE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaAnalysisContextPackage.MdaTypes.SAANALYSISCONTEXT_PACKAGE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaAnalysisContext_Package_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f3fbcb9c-818b-4717-ae96-13367a408566")
    public void setSaAnalysisContext_Package_optCriterion(final String value) {
        this.elt.putTagValue(SaAnalysisContextPackage.MdaTypes.SAANALYSISCONTEXT_PACKAGE_OPTCRITERION_TAGTYPE_ELT, value);
    }

    @objid ("9eb24311-9f80-497d-a667-d26fc2c55013")
    protected SaAnalysisContextPackage(final Package elt) {
        super(elt);
    }

    @objid ("4c94585e-eadd-4fd9-bae0-1fbac9ac371a")
    public static final class MdaTypes {
        @objid ("7337bb4a-73fb-4562-86e8-e5d05e8ef980")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("55e13232-7e79-4122-9a5f-c4955d13f9bc")
        public static TagType SAANALYSISCONTEXT_PACKAGE_ISSCHED_TAGTYPE_ELT;

        @objid ("bb368e68-cac7-4392-bc94-8da0f9f827ea")
        public static TagType SAANALYSISCONTEXT_PACKAGE_OPTCRITERION_TAGTYPE_ELT;

        @objid ("ca964039-f030-4103-9333-10c6fe186cfa")
        private static Stereotype MDAASSOCDEP;

        @objid ("5001a797-e1cc-4afd-a9d9-01ccaba9f8a3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("71f05bd3-2445-467b-97c3-96eed927fbfe")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0384bb11-0ccf-11df-8525-001302895b2b");
            SAANALYSISCONTEXT_PACKAGE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb13-0ccf-11df-8525-001302895b2b");
            SAANALYSISCONTEXT_PACKAGE_OPTCRITERION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb15-0ccf-11df-8525-001302895b2b");
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
