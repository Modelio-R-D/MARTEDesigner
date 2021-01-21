/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwCache_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e52591b3-4096-412f-9c32-ef0eece6138c")
public class HwCacheParameter extends HwMemoryParameter {
    @objid ("8b1036ad-5395-4a24-a7d3-bdd107b0d974")
    public static final String STEREOTYPE_NAME = "HwCache_Parameter";

    @objid ("b76ea80c-efd1-4369-bbea-42ced6c96899")
    public static final String HWCACHE_PARAMETER_LEVEL_TAGTYPE = "HwCache_Parameter_level";

    @objid ("a7532d39-ea10-4bdc-8bc2-035b542cb76d")
    public static final String HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE = "HwCache_Parameter_repl_Policy";

    @objid ("157e8e81-6229-478b-a622-52c05355d67d")
    public static final String HWCACHE_PARAMETER_STRUCTURE_TAGTYPE = "HwCache_Parameter_structure";

    @objid ("bf4a62d5-0c18-4b52-bdb9-3830700a6b20")
    public static final String HWCACHE_PARAMETER_TYPE_TAGTYPE = "HwCache_Parameter_type";

    @objid ("52841d65-674c-4c63-9c2a-d3fa8b28fca8")
    public static final String HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE = "HwCache_Parameter_writePolicy";

    /**
     * Tells whether a {@link HwCacheParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwCache_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c3a8cfb5-c273-4cce-a134-52ff24e0c724")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwCache_Parameter >> then instantiate a {@link HwCacheParameter} proxy.
     * 
     * @return a {@link HwCacheParameter} proxy on the created {@link Parameter}.
     */
    @objid ("cdaa2581-8c60-4e6c-8ca0-1d315c389da1")
    public static HwCacheParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheParameter.STEREOTYPE_NAME);
        return HwCacheParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheParameter} proxy from a {@link Parameter} stereotyped << HwCache_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwCacheParameter} proxy or <i>null</i>.
     */
    @objid ("b1831bf2-37cb-4b3e-b946-2678d5790361")
    public static HwCacheParameter instantiate(final Parameter obj) {
        return HwCacheParameter.canInstantiate(obj) ? new HwCacheParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCacheParameter} proxy from a {@link Parameter} stereotyped << HwCache_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwCacheParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("68994467-d19c-4d61-ba90-69cd01d1fbb0")
    public static HwCacheParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwCacheParameter.canInstantiate(obj))
        	return new HwCacheParameter(obj);
        else
        	throw new IllegalArgumentException("HwCacheParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("964dd8b2-e326-47c7-9fea-e5a3f1197572")
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
        HwCacheParameter other = (HwCacheParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("58c6eed4-f087-4bd3-80e1-84ada051f623")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Parameter_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0c4ae3d-343c-4b88-8bbd-cccafe394a72")
    public String getHwCache_Parameter_level() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Parameter_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("73776d1c-f3ae-4070-b964-30e80e575d3f")
    public String getHwCache_Parameter_repl_Policy() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Parameter_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d1c33ec-acc0-46e2-9d97-98bcb40ea362")
    public String getHwCache_Parameter_structure() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94cedc20-c0ec-4899-9e7d-06ba85f48554")
    public String getHwCache_Parameter_type() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Parameter_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca27097d-b3e2-49c2-bf10-173431e148b7")
    public String getHwCache_Parameter_writePolicy() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("5654f3a1-89e4-4c39-b1c2-5359c71184ae")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Parameter_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14642016-dcae-455a-8d67-bd772fd55874")
    public void setHwCache_Parameter_level(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Parameter_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60bbac90-0c3d-4f9b-a5be-cd81a09e5313")
    public void setHwCache_Parameter_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Parameter_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1bc785c-fe97-4222-ab97-59af0acbb3a4")
    public void setHwCache_Parameter_structure(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b4566bdc-9a4c-4d44-8f01-402260b4e9e1")
    public void setHwCache_Parameter_type(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Parameter_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5860167e-a35a-4037-8fc3-031a5eb5a279")
    public void setHwCache_Parameter_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("0a6be91d-0693-4a94-b463-fbac977f16f0")
    protected HwCacheParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("6e582b43-2782-40b1-8fa2-fa681a3dee82")
    public static final class MdaTypes {
        @objid ("fdc1a5b8-2154-438e-870b-46525183ecc8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3663167b-c351-4323-8e4c-d0ff2c8b2a5e")
        public static TagType HWCACHE_PARAMETER_LEVEL_TAGTYPE_ELT;

        @objid ("059179ca-4fa7-4ee4-9ab9-7ae04ed2a6cf")
        public static TagType HWCACHE_PARAMETER_TYPE_TAGTYPE_ELT;

        @objid ("27603473-02ce-4af6-aec5-8c1f96b7e82e")
        public static TagType HWCACHE_PARAMETER_STRUCTURE_TAGTYPE_ELT;

        @objid ("95bbfd01-03fd-4f7b-9802-5d28acc735bd")
        public static TagType HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE_ELT;

        @objid ("7d641856-752b-484f-b6ce-b5704c886fcf")
        public static TagType HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("fe672556-0322-47b1-ad18-86bd3be56445")
        private static Stereotype MDAASSOCDEP;

        @objid ("c1d3c404-0dd5-45db-84dd-b038793910d6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7f96215e-9bd7-4ed1-ab3b-46b7c2709b78")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "015479d0-0ccf-11df-8525-001302895b2b");
            HWCACHE_PARAMETER_LEVEL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479d7-0ccf-11df-8525-001302895b2b");
            HWCACHE_PARAMETER_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479de-0ccf-11df-8525-001302895b2b");
            HWCACHE_PARAMETER_STRUCTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479e5-0ccf-11df-8525-001302895b2b");
            HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479ec-0ccf-11df-8525-001302895b2b");
            HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479f3-0ccf-11df-8525-001302895b2b");
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
