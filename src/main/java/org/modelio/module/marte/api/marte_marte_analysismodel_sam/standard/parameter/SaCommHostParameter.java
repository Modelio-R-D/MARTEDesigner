/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.parameter.GaCommHostParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SaCommHost_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("822da32f-b6ef-44c2-bd38-58ee8f46f3ba")
public class SaCommHostParameter extends GaCommHostParameter {
    @objid ("c160bce0-8565-437b-a142-8c2276eadaed")
    public static final String STEREOTYPE_NAME = "SaCommHost_Parameter";

    @objid ("7665f026-f84e-4e8a-94bc-dc76f58f3636")
    public static final String SACOMMHOST_PARAMETER_ISSCHED_TAGTYPE = "SaCommHost_Parameter_isSched";

    @objid ("03c92c2d-3264-4824-bfd9-d7af59f27a8c")
    public static final String SACOMMHOST_PARAMETER_SCHSLACK_TAGTYPE = "SaCommHost_Parameter_schSlack";

    /**
     * Tells whether a {@link SaCommHostParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SaCommHost_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("88adbadd-ba29-4507-a295-daab1a2633b1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SaCommHost_Parameter >> then instantiate a {@link SaCommHostParameter} proxy.
     * 
     * @return a {@link SaCommHostParameter} proxy on the created {@link Parameter}.
     */
    @objid ("3945ed5c-67e7-415a-9ed2-e29683750da7")
    public static SaCommHostParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostParameter.STEREOTYPE_NAME);
        return SaCommHostParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostParameter} proxy from a {@link Parameter} stereotyped << SaCommHost_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SaCommHostParameter} proxy or <i>null</i>.
     */
    @objid ("969f44f8-9359-4b2c-bd3a-e362f9c1352b")
    public static SaCommHostParameter instantiate(final Parameter obj) {
        return SaCommHostParameter.canInstantiate(obj) ? new SaCommHostParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommHostParameter} proxy from a {@link Parameter} stereotyped << SaCommHost_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SaCommHostParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dbbc6e10-6f67-4402-ac03-f441fd3b00af")
    public static SaCommHostParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SaCommHostParameter.canInstantiate(obj))
        	return new SaCommHostParameter(obj);
        else
        	throw new IllegalArgumentException("SaCommHostParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("511c9108-1a8c-48e5-9d00-213a55a6fbad")
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
        SaCommHostParameter other = (SaCommHostParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("fd191a13-d894-4fa6-bb7a-307ea95b3582")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'SaCommHost_Parameter_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("850f79fc-661d-4b54-9979-353487a50f0b")
    public String getSaCommHost_Parameter_schSlack() {
        return this.elt.getTagValue(SaCommHostParameter.MdaTypes.SACOMMHOST_PARAMETER_SCHSLACK_TAGTYPE_ELT);
    }

    @objid ("83a82258-d5cc-401d-8069-19b8b9872e5f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_Parameter_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1acd52e2-4483-4a29-8ca3-670f7576e39f")
    public boolean isSaCommHost_Parameter_isSched() {
        return this.elt.isTagged(SaCommHostParameter.MdaTypes.SACOMMHOST_PARAMETER_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_Parameter_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a6666990-5416-4870-89c7-8c181f34f109")
    public void setSaCommHost_Parameter_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaCommHostParameter.MdaTypes.SACOMMHOST_PARAMETER_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaCommHostParameter.MdaTypes.SACOMMHOST_PARAMETER_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaCommHost_Parameter_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("84e912ae-1616-4587-8214-c52c20712638")
    public void setSaCommHost_Parameter_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostParameter.MdaTypes.SACOMMHOST_PARAMETER_SCHSLACK_TAGTYPE_ELT, value);
    }

    @objid ("bd8eb30f-a686-427a-9b1a-3c12a7143fe7")
    protected SaCommHostParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("0bece2a8-4a6d-4e69-9c6f-454b4d6013bf")
    public static final class MdaTypes {
        @objid ("ee8f4ed8-e4c1-4690-bf94-07c50c6d1c38")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5a83c84c-6a75-4079-a45a-71a22ca335d1")
        public static TagType SACOMMHOST_PARAMETER_ISSCHED_TAGTYPE_ELT;

        @objid ("b271d608-3ca6-4ea3-9449-3d0d3fa5ca58")
        public static TagType SACOMMHOST_PARAMETER_SCHSLACK_TAGTYPE_ELT;

        @objid ("3ce0ab07-1973-4dc3-8d25-690c83450df0")
        private static Stereotype MDAASSOCDEP;

        @objid ("c1e33a14-efb0-4f0b-9606-c10b56e4dd1e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8cc81063-4f10-46e8-a9be-a5c894d82e6d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "039c9244-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_PARAMETER_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c924b-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_PARAMETER_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c9252-0ccf-11df-8525-001302895b2b");
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
